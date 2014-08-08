//------------------------------------
//FactoryLista
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

class ListFactory<E> {
    public Lista<E> getLista(String entry) {
    // seleccion de la implementacion a utilizar:
        if (entry.equals("4"))
            return new ListaSimple<E>(); //regresa lista con nodo simple
	if (entry.equals("5"))
            return new ListaDoble<E>(); //regresa lista con doble nodo
        if (entry.equals("6"))
            return new ListaCirc<E>();// regresa lista circular
        else
            return null;
    }
}
