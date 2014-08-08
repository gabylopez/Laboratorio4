//------------------------------------
//Factory
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

class Factory<E> {
    //Se implementa el Stack y se utiliza el patron Factory

    public Stack<E> getStack(String entry) { // para seleccionar la implementacion a usar

        if (entry.equals("1"))
            return new StackArrayList<E>(); //ArrayList
	if (entry.equals("2"))
            return new StackVector<E>(); //Vector
        if (entry.equals("3"))
            return new StackList<E>(); //lista
        else
            return null;
    }

