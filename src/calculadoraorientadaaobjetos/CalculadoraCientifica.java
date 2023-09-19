/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraorientadaaobjetos;

/**
 *
 * @author vicentin.7910
 */
public class CalculadoraCientifica extends Calculadora { 
    public double raizQuadrada(double a){
     return Math.sqrt(a);
    }
       public double potencia(double a,double b){
           return Math.pow(a, b);
  
        }
       
      public double tengente (double a){
          return Math.toDegrees(a);
      }
}
