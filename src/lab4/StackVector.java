//------------------------------------
//Calculadora
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

import java.util.*;

public class StackVector<E> extends StackAbs<E> {
     
    protected Vector<E> stack;
    
    //Constructor
    public StackVector(){
        stack = new Vector<E>(0); 
    }
    
    //Atributos 
    private int stackPointer = 0;
    private boolean Nodo; 
    
    
    @Override
    public void push(E item) {
        stack.addElement(item);
        stackPointer = stackPointer + 1;
        
    }

    @Override
    public E pop() {
        if(stackPointer>0){
            E last = stack.lastElement();
            stack.removeElementAt(stackPointer-1);
            stackPointer = stackPointer - 1; 
            return last;
        }
        return null;
                    
    }

    @Override
    public E peek() {
        return stack.lastElement();
    }

    @Override
    public boolean Vacio() {
        if (stackPointer==0)
            setVacio(true);
        else
            setVacio(false);
        return Vacio;
    }

    @Override
    public int tamañol() {
       return stackPointer;
    }

    /**
     * @return the stackPointer
     */
    private int getStackPointer() {
        return stackPointer;
    }

    /**
     * @param stackPointer the stackPointer to set
     */
    private void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;
    }

    /**
     * @return the Vacio
     */
    private boolean isVacio() {
        return Vacio;
    }

    /**
     * @param Vacio the Vacio to set
     */
    private void setVacio(boolean Vacio) {
        this.Vacio = Vacio;
    }
    
    
}
