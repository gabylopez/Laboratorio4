//------------------------------------
//ListaCirc
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class ListaCirc<E> extends ListaAbs<E> {
    
    protected Nodo<E> cola; 
    protected int contador;

    public ListaCirc()
    // nueva lista circular
    {
       cola = null;
       contador = 0;
    }

    public void addFirst(E val)
    //  para añadir un elemto al inicio de la lista
    {
       Nodo<E> tem = new Nodo<E>(val);
       if (cola == null) { // se añade el primer elemento
           cola = tem;
           cola.setNext(cola);
       } else { // si el elemento ya existe
           tem.setNext(cola.next());
           cola.setNext(tem);
       }
       contador++;
    }


    public void addLast(E val)
    //  añade el elemento al final de la lista
    {
       // new entry:
       addFirst(val);
       cola = cola.next();
    }

    public E removeFirst()
    // quita el elemento del final
    {
       Nodo<E> apunt = cola;
       while (apunt.next() != cola) {
           apunt = apunt.next();
       }
     
       Nodo<E> tem = cola;
       if (apunt == cola)
       {
           cola = null;
       } else {
           apunt.setNext(cola.next());
           cola = apunt;
       }
       contador--;
       return tem.val();
    }

   
    public int tamaño() {
        return contador;
    }

   // @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

	    public E get(int i) {
        if((i>=0) && (i<tamaño()) && !vacio()){
            Nodo<E> apunt = cola.next();
            while (i>0){
                apunt = apunt.next();
                i--;
            }
            return apunt.val();
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

   // @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

   // @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    public E remove(int i) {
        if((i>=0) && (i<tamaño()) && !vacio()){
            Nodo<E> previous = cola;
            Nodo<E> apunt = cola.next();
            while(i>0){
                i--;
                previous=apunt;
                apunt = apunt.next();
            }
            previous.setNext(apunt.next());
            contador--;
            
            return apunt.val();
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
	
   // @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }
    
  //  @Override
    public E remove(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

   // @Override
    public void add(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

   // @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

   // @Override
    public int indexOf(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

  //  @Override
    public int lastIndexOf(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

}
