//------------------------------------
//Stack
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public interface Stack<E> {
     public void push(E item);
   // post: el elelmento es agregado al stack. Sera
   //       el proximo en salir

   public E pop();
   // pre: stack no esta vacio
   // post: el elemento ingresado mas recientemente
   //       es retirado.

   public E peek();
   //pre: stack no esta vacio
   //post: el valor mas reciente es retornado
   //      pero no es sacado del stack.

   public boolean vacio();
   //post: regresa true si el stack esta vacio

   public int tamaño();
   //post: regresa la cantidad de elementos
   //      en el stack
    
}
