//------------------------------------
//Calculadora
// Augusto Cárdenas 13136
// Maria Gabriela Lopez 13056
// Andres Lainfiesta 13072
// 9 de Agosto de 2014
//------------------------------------

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Calculadora {
    
    public String operacion;
    public char cant;
    public Factory miFactor = new Factory();
    public Stack<String> miVector = miFactor.getStack(menu());
    public int jLabel2 =0;
    public int cant1 =0;
    public int cant2 =0;
    public String imp ="";
   
    public String menu(){
        System.out.println(" ¡Bienvenido! Seleccione como desea almacenar sus datos.");
   
        imp = JOptionPane.showInputDialog("\n1. ArrayList\n2. Vector\n3. Lista");
  
            
     
        return imp;
    }
    
    
    public void Numero(){
         try{
            FileReader fr = new FileReader("Datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            while ((cadena=br.readLine())!=null){
                for(int j=0;j<=cadena.length()-1;j++){
                    cant=cadena.charAt(j);
                    operacion=cant+"";
                    if(cant!=' '){
                        if(miVector.tamaño()==2){
                            if(operacion.equals("+")){
                                total=(Integer.parseInt(miVector.pop()))+(Integer.parseInt(miVector.pop()));                              
                            }
                            if(operacion.equals("-")){
                                cant1=(Integer.parseInt(miVector.pop()));
                                cant2=(Integer.parseInt(miVector.pop()));
                                total=cant1-cant2;
                            }
                            if(operacion.equals("*")){
                                total=(Integer.parseInt(miVector.pop()))*(Integer.parseInt(miVector.pop()));
                            }
                            if(operacion.equals("/")){
                                cant1=(Integer.parseInt(miVector.pop()));
                                cant2=(Integer.parseInt(miVector.pop()));
                                total=cant1/cant2;
                            }
                            miVector.push(Integer.toString(total));
                        }else{
                            miVector.push(operacion);
                        }
                    }
                    
                
                }
                System.out.println("\nTotal: "+ total);
                cadena=br.readLine();
                
            }
        }catch(Exception ex){
            
      }
    }
}
