//------------------------------------
//Lista
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------


public interface Lista<E> {
   public int size();
   // post: returns number of elements in Lista

   public boolean Vacio();
   // post: returns true iff Lista has no elements

   public void clear();
   // post: empties Lista

   public void addFirst(E value);
   // post: value is added to beginning of Lista

   public void addLast(E value);
   // post: value is added to end of Lista

   public E getFirst();
   // pre: Lista is not empty
   // post: returns first value in Lista

   public E getLast();
   // pre: Lista is not empty
   // post: returns last value in Lista

   public E removeFirst();
   // pre: Lista is not empty
   // post: removes first value from Lista

   public E removeLast();
   // pre: Lista is not empty
   // post: removes last value from Lista

   public E remove(E value);
   // post: removes and returns element equal to value
   // otherwise returns null

   public void add(E value);
   // post: value is added to tail of Lista

   public E remove();
   // pre: Lista has at least one element
   // post: removes last value found in Lista

   public E get();
   // pre: Lista has at least one element
   // post: returns last value found in Lista

   public boolean contenido(E value);
   // pre: value is not null
   // post: returns true iff Lista contains an object equal to value

   public int indexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

   public int lastIndexOf(E value);
   // pre: value is not null
   // post: returns (0-origin) index of value,
   // or -1 if value is not found

   public E get(int i);
   // pre: 0 <= i < size()
   // post: returns object found at that location

   public E set(int i, E o);
   // pre: 0 <= i < size()
   // post: sets ith entry of Lista to value o;
   // returns old value

   public void add(int i, E o);
   // pre: 0 <= i <= size()
   // post: adds ith entry of Lista to value o

   public E remove(int i);
   // pre: 0 <= i < size()
   // post: removes and returns object found at that location

   /*public Iterator<E> iterator();
   // post: returns an iterator allowing
   // ordered traversal of elements in Lista
    */
}
