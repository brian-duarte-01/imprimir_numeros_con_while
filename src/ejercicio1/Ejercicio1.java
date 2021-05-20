// Ejercicio1
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        int cantidad;
        int contador=1;
        System.out.println("cuantos numeros desea agregar");
        cantidad=in.nextInt();
        
        while(contador<cantidad){
            contador++;
            if(contador%2==0){
                System.out.println("Numero Par es: "+contador+"\n");
            }
            
        }
        
    }
    
}
