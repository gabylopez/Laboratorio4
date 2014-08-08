//------------------------------------
//ListaDoble
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class ListaDoble<E> extends AbstractList<E> {
    protected int contador;
    protected NodeDoble<E> primero;
    protected NodeDoble<E> cola;

    public ListaDoble() // contruye una lista vacia
    {
       primero = null;
       cola = null;
       contador = 0;
    }


    public void addFirst(E value) // añade un elemento al principio

    {
       primero = new NodeDoble<E>(value, primero, null);
       if (cola == null) cola = primero;
       contador++;
    }


    public void addLast(E value) //  añade un elemento al final

    {

       cola = new NodeDoble<E>(value, null, cola);

       if (primero == null) primero = cola;
       contador++;
    }


    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	    public E removeFirst() // quita el primer elemento
    {
        if(!isEmpty()){
            NodeDoble<E> temp = primero;
            primero = primero.next();
            if(primero!= null){
                primero.setPrevious(null);
            } else{
                cola = null;
            }
            temp.setNext(null);
            contador--;
            return temp.value();
        }else {
            throw new IndexOutOfBoundsException();
        }
    }
    
    public E removeLast()// quita el ultimo elemento
    {
       NodeDoble<E> temp = cola;
       cola = cola.previous();
       if (cola == null) {
           primero = null;
       } else {
           cola.setNext(null);
       }
       contador--;
       return temp.value();

}

    
}