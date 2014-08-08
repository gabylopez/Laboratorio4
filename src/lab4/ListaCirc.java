//------------------------------------
//ListaCirc
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class ListaCirc<E> extends ListaAbs<E> {
    
    protected Node<E> cola; 
    protected int contador;

    public ListaCirc()
    // nueva lista circular
    {
       cola = null;
       contador = 0;
    }

    public void addFirst(E value)
    //  para añadir un elemto al inicio de la lista
    {
       Node<E> tem = new Node<E>(value);
       if (cola == null) { // se añade el primer elemento
           cola = tem;
           cola.setNext(cola);
       } else { // si el elemento ya existe
           tem.setNext(cola.next());
           cola.setNext(tem);
       }
       contador++;
    }


    public void addLast(E value)
    //  añade el elemento al final de la lista
    {
       // new entry:
       addFirst(value);
       cola = cola.next();
    }

    public E removeFirst()
    // quita el elemento del final
    {
       Node<E> apunt = cola;
       while (apunt.next() != cola) {
           apunt = apunt.next();
       }
     
       Node<E> tem = cola;
       if (apunt == cola)
       {
           cola = null;
       } else {
           apunt.setNext(cola.next());
           cola = apunt;
       }
       contador--;
       return tem.value();
    }

   
    public int tamaño() {
        return contador;
    }

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

	    public E get(int i) {
        if((i>=0) && (i<tamaño()) && !isEmpty()){
            Node<E> apunt = cola.next();
            while (i>0){
                apunt = apunt.next();
                i--;
            }
            return apunt.value();
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    public E remove(int i) {
        if((i>=0) && (i<tamaño()) && !isEmpty()){
            Node<E> previous = cola;
            Node<E> apunt = cola.next();
            while(i>0){
                i--;
                previous=apunt;
                apunt = apunt.next();
            }
            previous.setNext(apunt.next());
            contador--;
            
            return apunt.value();
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
	
    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }
    
    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

}
