//------------------------------------
//ListaSimple
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

  public class ListaSimple<E> extends ListaAbs<E> {
    
    
   protected int contador; // list size
   protected Nodo<E> head; // ref. to first element

   public ListaSimple()
   // post: generates an empty list
   {
      head = null;
      contador = 0;
   }
   
   public int tamaño()
   // post: returns number of elements in list
  {
    return contador;
  }
  
  public void addFirst(E val)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Nodo<E>(val, head);
     contador++;
  }
  
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Nodo<E> tem = head;
     head = head.next(); // move head down list
     contador--;
     return tem.val();
  }
  
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.val();
  }
  
  public void addLast(E val)
  // post: adds value to end of list
  {
      // location for new value
      Nodo<E> tem = new Nodo<E>(val,null);
      if (head != null)
     {
         // pointer to possible tail
         Nodo<E> apunt = head;
         while (apunt.next() != null)
         {
                apunt = apunt.next();
         }
		 
         apunt.setNext(tem);
      } else head = tem;
	  
	  contador++;
	  
   }
   
   
   public boolean contenido(E val)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Nodo<E> apunt = head;
	  
      while (apunt != null &&
             !apunt.val().equals(val))
     {
          apunt = apunt.next();
      }
      return apunt != null;
}

    //@Override
    public void clear() {
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

    //@Override
    public E remove(E value) {
        if (contador>0)
        {
           Nodo<E> halo = head.next();
           return halo.val();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | temlates.
        return null;
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
}
