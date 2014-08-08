//------------------------------------
//Nodo
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public class Nodo<E> {
    protected E datos; // valor guardado en este elemento
   protected Nodo<E> nextElement; // referencia al siguiente elemento

   public Nodo(E v, Nodo<E> next)

   {
       datos = v;
       nextElement = next;
   }

   public Nodo(E v)
   // contruye una nueva cola de la lista valor v
   {
      this(v,null);
   }

   public Nodo<E> next()
   // devuelve la referencia al siguiente valor en la lista
   {
      return nextElement;
   }

   public void setNext(Nodo<E> next)
   // hace referencia al siguiente valor
   {
      nextElement = next;
   }

   public E val()
   // devuelve el valor asociado con este elemento
   {
      return datos;
   }

   public void setVal(E val)
   {
      datos = val;
   }
    
}
