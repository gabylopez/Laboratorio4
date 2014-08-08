//------------------------------------
//NodoDoble
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------


public class NodoDoble<E> {
    protected E dato;
    protected NodoDoble<E> siguiente;
    protected NodoDoble<E> anterior;

    public NodoDoble(E v,
                            NodoDoble<E> next,
                            NodoDoble<E> previous)
    {
        dato = v;
        siguiente = next;
        if (siguiente != null)
            siguiente.anterior = this;
        anterior = previous;
        if (anterior != null)
            anterior.siguiente = this;
    }
    
    public void setPrevious(NodoDoble<E> previous)
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
	
	 public NodoDoble(E v) // contruye solamente un elemento

    {
        this(v,null,null);
    }
    
    public NodoDoble<E> previous()
    {
        return anterior;
    }
    
    public void setNext(NodoDoble<E> v)
    {
        siguiente = v;
    }
    
    public NodoDoble<E> next()
    {
        return siguiente;
    }

}
