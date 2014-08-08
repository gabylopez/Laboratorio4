//------------------------------------
//ListaAbs
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

public abstract class ListaAbs<E> implements List<E> {
    public ListaAbs()
   {
   }

   public boolean vacio() // si la lista esta vacia entonces true
   {
      return tamaño() == 0;
   }
  
  public boolean contenido(E val) // si hay dos iguales entonces regresa True

  {
	return -1 != indexOf(val);
  }
}
