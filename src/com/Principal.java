package com;

import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import clases.CapacidadEndeudamiento;
import clases.MensajesError;

public class Principal {

public Principal() {

    Scanner scanner = new Scanner(System.in);

    String numero1= "0";
    String numero2= "0";
    String numero3= "0";
    double capacidad;
    boolean validar = false;
    String entrada = "C";
    String textoMensaje;
    
    CapacidadEndeudamiento calcular = new CapacidadEndeudamiento();
    
    MensajesError mensaje = new MensajesError();
    
    textoMensaje = mensaje.EnviarMensaje();
    
    
    while (entrada.equals("C")) {
       
     validar = false; 	
     while (validar== false) { 
       numero1 = JOptionPane.showInputDialog("Cùales son sus ingresos: ");
       if (isNumeric(numero1)) {
        validar = true; 
       }
      }

     validar = false; 	
     while (validar== false) { 
      numero2 = JOptionPane.showInputDialog("Cùales son sus gastos fijos mensuales: ");
      if (isNumeric(numero2)) {
          validar = true; 
         }
        }

     validar = false; 	
     while (validar== false) { 
      numero3 = JOptionPane.showInputDialog("Cùales son sus otros gastos: ");
      if (isNumeric(numero3)) {
          validar = true; 
      }
     }
        
     capacidad = calcular.getCapacidadEndeudamiento(numero1, numero2, numero3);
    
     JOptionPane.showMessageDialog( null, "Ingresos: " + numero1 + "\n" +
                                "Gastos fijos: " + numero2 + "\n" + 
                                "Otros gastos: " + numero3 + "\n" +
                                "Su capacidad de endeudamiento: " + capacidad);
    /*
     System.out.println("Ingresos: " + numero1);
     System.out.println("Gastos fijos mensuales: " + numero2);
     System.out.println("Otros gastos: " + numero3);
     System.out.println("Su capacidad de endeudamiento es: " + capacidad );
    
     entrada = JOptionPane.showInputDialog("Digite F para terminar C para calcular nuevamente : ");
    */
      
   }
}

        public static boolean isNumeric(String value) {

        	
        	MensajesError mensaje = new MensajesError();
            
                	
         try {
             Double.parseDouble(value);
             return true;
             
         } catch (NumberFormatException nfe){
        	 
        	 JOptionPane.showMessageDialog( null, mensaje.EnviarMensaje());
        	 
        	 return false;
        }
       }


}
