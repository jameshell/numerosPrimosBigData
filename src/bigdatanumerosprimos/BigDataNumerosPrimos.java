/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdatanumerosprimos;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class BigDataNumerosPrimos {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int i=input.nextInt();
        int contador=0;
        int cantNumPrimos=0;
        while(contador<i){
            if(isPrime(contador)==true){
                cantNumPrimos++;
            }
            contador++;
        }
        System.out.println("Cantidad de numeros primos desde 0 hasta "+i+" es:"+""+cantNumPrimos);
    }
    
    
  public static boolean isPrime(int n) {
    //Se prueba si es multiplo de 2
    if (n%2==0) return false;
    //Si no checkear impares
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
    
}
