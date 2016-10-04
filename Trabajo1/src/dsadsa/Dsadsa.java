/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 1- calcular el perimetro del triangulo
   2- calcular la superficie del triangulo
   3- calcular perimetro del cuadrado
   4- calcular perimetro del cuadrado
 */ 
package dsadsa;

import javax.swing.JOptionPane;

/**
 *
 * @author Puesto 1.6
 */
public class Dsadsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numeroSW;
    
    String cadenaNumeroSW;
    
    
                    
        do {
         cadenaNumeroSW=JOptionPane.showInputDialog("MENU\n1- Calcular el perímetro del triángulo"
                        + "\n2 - Calcular superficie del triángulo"
                        + "\n3 - Calcular perímetro del cuadrado"
                        + "\n4 - Calcular superficie del cuadrado"
                        + "\n5 - Calcular perímetro del pentágono"
                        + "\n6 - Salir");
    
         numeroSW = Integer.parseInt(cadenaNumeroSW);
        
            if (numeroSW == 1) {
            
            int lado1;
            int lado2;
            int lado3;
            int perimetro;
            
            String cadenaLado1;
            String cadenaLado2;
            String cadenaLado3; 
            
            cadenaLado1 = JOptionPane.showInputDialog("Lado 1: ");
            cadenaLado2 = JOptionPane.showInputDialog("Lado 2: ");
            cadenaLado3 = JOptionPane.showInputDialog("Lado 3: ");
            
            lado1 = Integer.parseInt(cadenaLado1);
            lado2 = Integer.parseInt(cadenaLado2);
            lado3 = Integer.parseInt(cadenaLado3);
            
            perimetro = lado1 + lado2 + lado3; 
            
            JOptionPane.showMessageDialog(null,"Perímetro: "+perimetro);
                              
            } else {
            }
            
            if (numeroSW == 2) {
               
            int base;
            int altura;
            int superficie;
                
            String cBase;
            String cAltura;
                
            cBase = JOptionPane.showInputDialog("Ingrese el valor de la base: ");
            base = Integer.parseInt(cBase);
                
            cAltura = JOptionPane.showInputDialog("Ingrese el valor de la altura: ");
            altura = Integer.parseInt(cAltura);
                
            superficie = base * (altura/2);
                
            JOptionPane.showMessageDialog(null, "La superficie del triangulo es: "+ superficie);
                
            } else {
            }
            
            if (numeroSW == 3) {
            int lado1;
            int lado2;
            int lado3;
            int lado4;
            int perimetro;
            
            String cadenaLado1;
            String cadenaLado2;
            String cadenaLado3;
            String cadenaLado4;
            
            cadenaLado1 = JOptionPane.showInputDialog("Lado 1: ");
            cadenaLado2 = JOptionPane.showInputDialog("Lado 2: ");
            cadenaLado3 = JOptionPane.showInputDialog("Lado 3: ");
            cadenaLado4 = JOptionPane.ShowInputdialog("Lado 4: ");
            
            lado1 = Integer.parseInt(cadenaLado1);
            lado2 = Integer.parseInt(cadenaLado2);
            lado3 = Integer.parseInt(cadenaLado3);
            lado4 = Integer.parseInt(cadenaLado4);
            
            perimetro = lado1 + lado2 + lado3 + lado3 + lado4; 
            
            JOptionPane.showMessageDialog(null,"Perímetro del cuadrado es: "+perimetro);
                
            } else {
            }
             
            if (numeroSW == 4) {
                int lado;
                int superficie;
                
                String cadenaLado;
                
                cadenaLado=JOptionPane.showInputDialog("Ingrese el valor de los lados:");
                
                lado=Integer.parseInt(cadenaLado);
                
                superficie=lado*lado;
                JOptionPane.showMessageDialog(null, "La superficie del cuadrado es: "+superficie);
            } else {
            }
              
            if (numeroSW == 5) {
                       int lado1;
        int lado2;
        int lado3;
        int lado4;
        int lado5;
        int perimetro;
            
        String cadenaLado1;
        String cadenaLado2;
        String cadenaLado3; 
        String cadenaLado4; 
        String cadenaLado5; 
            
        cadenaLado1=JOptionPane.showInputDialog("Lado 1: ");
        lado1 = Integer.parseInt(cadenaLado1);
        
        cadenaLado2=JOptionPane.showInputDialog("Lado 2: ");
        lado2 = Integer.parseInt(cadenaLado2);
        
        cadenaLado3=JOptionPane.showInputDialog("Lado 3: ");
        lado3 = Integer.parseInt(cadenaLado3);
        
        cadenaLado4=JOptionPane.showInputDialog("Lado 4: ");
        lado4 = Integer.parseInt(cadenaLado4);
        
        cadenaLado5=JOptionPane.showInputDialog("Lado 5: ");
        lado5 = Integer.parseInt(cadenaLado5);
        
            
        perimetro = lado1 + lado2 + lado3 + lado4 + lado5; 
            
        JOptionPane.showMessageDialog(null,"Perímetro: "+perimetro);
                
            } else {
            }
        
        } while (numeroSW != 6);
        
    
    
    
    
    }
    
}
