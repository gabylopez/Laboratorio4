//------------------------------------
//Calculadora
// Augusto C�rdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

import java.util.ArrayList;

public class StackArrayList<E> extends StackAbs<E> {
    protected ArrayList<E> datos;

    public StackArrayList()
    // post: constructs a new, empty stack
    {
    	datos = new ArrayList<E>();
    }

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
    	datos.add(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
    	return datos.remove(tama�o()-1);
    }
    
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
    	return datos.get(tama�o() - 1);
    }
    
    public int tama�o()
    // post: returns the number of elements in the stack
    {
    	return datos.tama�o();
    }
    
    public boolean vacio()
    // post: returns true if and only if the stack is empty
    {
    	return tama�o() == 0;
    }    
}
