//------------------------------------
//StackLista
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class StackLista<E> extends StackAbs<E> {
    public ListFactory miFactor = new ListFactory();
    protected List<E> datos = miFactor.getLista(menu());
    
    public String menu()
    {
        System.out.println("\n Tipo de Lista:");
        System.out.println("\n4. Lista con Nodo Simple \n5. Lista con Doble Nodo \n6. Lista Circular");
        return "5";
    }
    

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
    	datos.addFirst(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return datos.removeFirst();
    }
    
    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
    	return datos.get(tamaño() - 1);
    }
    
    public int size()
    // post: returns the number of elements in the stack
    {
    	return datos.tamaño();
    }
    

}
