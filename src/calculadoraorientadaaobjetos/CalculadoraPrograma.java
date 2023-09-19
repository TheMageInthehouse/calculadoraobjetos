/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author vicentin.7910
 */
public class CalculadoraPrograma {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        Scanner entrada = new Scanner(System.in);
          
        int option ;
       double num3 ,num4 ;  
        boolean continuar = true;
        
         String optionescolha;
          while(continuar){
          
           System.out.println("-----------------------------------");
                System.out.println("calculadora four operetion basic");
                System.out.println("-----------------------------------");
                System.out.println("selecine um option");
                System.out.println("1 soma");
                System.out.println("2 divisao");
                System.out.println("3 mutiplication");
                System.out.println("4 subtracao");
                System.out.println("5 potencia");
                System.out.println("6 raiz quadrada");
                 System.out.println("7 tangencia");
                System.out.println("_______________________________");
          
          option = entrada.nextInt();
          
           if(option == 1){//soma!!5
                 //entrada do primeiro valor  a ser calculado
                System.out.println("imforme o primeiro numero");
               float num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
               System.out.println("imforme o segundo numero");
              float num2 = entrada.nextFloat();
                calculadora.somar(num1, num2);
                System.out.println("resultado:   " + calculadora.somar(num1,num2));
            
           }else if(option == 2){//Subtração!!
                 //entrada do primeiro valor  a ser calculado
               System.out.println("imforme o primeiro numero");
              float  num1 = entrada.nextFloat();
 
             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
              float  num2 = entrada.nextFloat();
                 calculadora.divisao(num1, num2);
                  System.out.println("resultado" + calculadora.divisao(num1,num2));
            
           
           
           }else if(option== 3){//divisão!!
                 //entrada do primeiro valor  a ser calculado
               System.out.println("imforme o primeiro numero");
              float num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
               System.out.println("imforme o segundo numero");
              float num2 = entrada.nextFloat();
                 calculadora.multiplicar(num1, num2);
                  System.out.println("resultado" + calculadora.multiplicar(num1,num2));
            
           
           }else if(option == 4){//muçtiplicão!!
                 //entrada do primeiro valor  a ser calculado
               System.out.println("imforme o primeiro numero");
              float num1 = entrada.nextFloat();

             //entrada do segundo valor a ser calculado
              System.out.println("imforme o segundo numero");
               float num2 = entrada.nextFloat();
               calculadora.subtrair(num1, num2);
                System.out.println("resultado" + calculadora.subtrair(num1,num2));
            
           
           } else if(option == 5){//soma!!5
                 //entrada do primeiro valor  a ser calculado
              System.out.println("imforme o primeiro numero");
                num3 = entrada.nextDouble();
              
              System.out.println("imforme o segundo numero");
                num4 = entrada.nextDouble();
                 cc.potencia(num3, num4);
                  System.out.println("resultado" + cc.potencia(num3,num4));
           
           
           }else if(option == 6){
            System.out.println("imforme o numero");
              num3 = entrada.nextDouble();
                cc.raizQuadrada(num3);
                 System.out.println("resultado" + cc.raizQuadrada(num3));

           }else if(option == 7){
            System.out.println("imforme o numero");
              num3 = entrada.nextDouble();
                cc.tengente(num3);
                 System.out.println("resultado" + cc.tengente(num3)); 
                 
                 
           }else if(option == 8){
                System.out.println("option inexistente!");
            }
           
             System.out.println("you are continue ? (s/n)");
               optionescolha = entrada.next();
              
              if(optionescolha.equals("S") || optionescolha.equals("s")){
                 continuar = true;
             }else{
                 continuar = false;
                }
//       Scanner entrada = new Scanner (System.in);
//       
//       System.out.println("infrome o primeiro valor:  ");
//        float num1 = entrada.nextFloat();
//        
//        System.out.println("informe o segundo valor:    ");
//        float num2 = entrada.nextFloat();
//     
       
         

          }
                  
    }  
}
