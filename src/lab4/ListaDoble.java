//------------------------------------
//ListaDoble
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class ListaDoble<E> extends ListaAbs<E> {
    protected int contador;
    protected NodoDoble<E> primero;
    protected NodoDoble<E> cola;

    public ListaDoble() // contruye una lista vacia
    {
       primero = null;
       cola = null;
       contador = 0;
    }


    public void addFirst(E val) // añade un elemento al principio

    {
       primero = new NodoDoble<E>(val, primero, null);
       if (cola == null) cola = primero;
       contador++;
    }


    public void addLast(E val) //  añade un elemento al final

    {

       cola = new NodoDoble<E>(val, null, cola);

       if (primero == null) primero = cola;
       contador++;
    }


    //@Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }


    //@Override
    public E remove(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public void add(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public int indexOf(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public int lastIndexOf(E val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }

    //@Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
    }
	
	    public E removeFirst() // quita el primer elemento
    {
        if(!vacio()){
            NodoDoble<E> tem = primero;
            primero = primero.next();
            if(primero!= null){
                primero.setPrevious(null);
            } else{
                cola = null;
            }
            tem.setNext(null);
            contador--;
            return tem.val();
        }else {
            throw new IndexOutOfBoundsException();
        }
    }
    
    public E removeLast()// quita el ultimo elemento
    {
       NodoDoble<E> tem = cola;
       cola = cola.previous();
       if (cola == null) {
           primero = null;
       } else {
           cola.setNext(null);
       }
       contador--;
       return tem.val();

}

    
}