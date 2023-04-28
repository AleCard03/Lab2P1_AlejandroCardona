/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_alejandrocardona;
import java.util.Scanner;

public class Lab2P1_AlejandroCardona {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int continuar = 1;
       while(continuar ==1){
           System.out.println("1. Clasificando Números");
           System.out.println("2. Aproximando PI");
           System.out.println("3. MCD");
           System.out.println("Ingrese una opcion");
           int opcion = read.nextInt();
           switch(opcion){
               case 1:   {
                  int divs = 0;
                  int cont =1;
                  System.out.println("Ingrese el número que desea evaluar");
                  int num = read.nextInt();
                  while(num<1){
                      System.out.println("Ingrese un numero mayor a 0");
                  }
                  boolean par = true;
                  boolean prime = true;
                  if(num%2==1){
                      par = false;
                  }
                  while(cont<=num){
                      if(num%cont==0){
                          divs++;
                      }//fin if
                      cont++;
                  }//fin while
                  if(divs>2){
                      prime = false;
                  }//fin if
                  if(prime){
                      if(par){
                        System.out.println("El numero ingresado es par y primo."); 
                      }
                      else{
                          System.out.println("El numero ingresado es impar y primo");
                      }
                  }//fin if
                  else{
                       if(par){
                        System.out.println("El numero ingresado es par"); 
                      }//fin if
                      else{
                          System.out.println("El numero ingresado es impar");
                      }//fin else
                  }//fin else                  
               }//fin case
               break;
               case 2: {
                   System.out.println("Ingrese la precisión del cálculo");
                   int limite = read.nextInt();
                   double acum = 1;
                   int cont = 1;
                   while(cont<=limite){
                       double exp = 4* Math.pow(cont , 2);
                       double maths = (double)exp/((double)exp-1);
                       acum *= maths;
                       cont++;
                   }//fin while
                   System.out.println("pi = "+acum * 2);
               }//fin case
               break;
               case 3: {
                   System.out.println("Ingrese A");
                   int A = read.nextInt();
                   
                   System.out.println("Ingrese B");
                   int B = read.nextInt();
                   while(A<1 || B<1){
                       System.out.println( "Ingrese un numero A mayor a 0");
                       A = read.nextInt();
                       System.out.println("Ingrese un numero B mayor a 0");
                       B= read.nextInt();
                   }
                   int resp1 = A;
                   int resp2 = B;
                   int cont = 0;
                   while(A!=B){
                       if(A>B){
                          A = A-B; 
                       }//fin if
                       else {
                          B = B-A;
                       }
                       cont++;
                   }//fin while
                   System.out.println("El MCD de "+resp1+" y "+resp2+" es: "+A);
               }//fin case
               break;
               default:
                   System.out.println("El valor ingresado no es válido");
               break;
           }//fin switch
           System.out.println("Desea continuar?[1]");
           continuar = read.nextInt();
       }//fin while 
    }//fin main
    
}//fin class
