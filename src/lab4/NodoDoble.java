//------------------------------------
//NodeDoble
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------


public class NodeDoble<E> {
    protected E dato;
    protected NodeDoble<E> siguiente;
    protected NodeDoble<E> anterior;

    public NodeDoble(E v,
                            NodeDoble<E> next,
                            NodeDoble<E> previous)
    {
        dato = v;
        siguiente = next;
        if (siguiente != null)
            siguiente.anterior = this;
        anterior = previous;
        if (anterior != null)
            anterior.siguiente = this;
    }
    
    public void setPrevious(NodeDoble<E> previous)
    {
        anterior = previous;
    }
    
    public E value()
    {
        return dato;
    }
    
    public void setValue(E value)
    {
        dato = value;
    }
	
	 public NodeDoble(E v) // contruye solamente un elemento

    {
        this(v,null,null);
    }
    
    public NodeDoble<E> previous()
    {
        return anterior;
    }
    
    public void setNext(NodeDoble<E> v)
    {
        siguiente = v;
    }
    
    public NodeDoble<E> next()
    {
        return siguiente;
    }

}
