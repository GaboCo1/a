/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenejercicio3;
import java.util.*;
/**
 *
 * @author OMNISPORT
 */
public class EXAMENEJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
  int D=0;
  
        System.out.println("Diguite el numero de datos a ingresar: " );
   D=leer.nextInt();
   int [] n = new int[D];
  int[] dato = new int[1000];
  int i=0;
  int cantN=0;
  int cantPo=0;
  int cantCer=0;
  int pos=0;
  float porse=0;
   for(i=0; i< n.length; i++){
         
   System.out.println("Diguite el dato a ingresar"+(i+1)+": " );
   dato[i]= leer.nextInt();
   
   if(dato[i] < 0){
   
       cantN++;
       
   }
   else if(dato[i]>0){
       
       cantPo++;
   }
   
   else if(dato[i]==0){
       cantCer++;
   }
   
   
  }
  
      porse=((D*100)- (cantN * 100));
      
  
      System.out.println("CANTIDAD DE NUMEROS P (POSITIVOS): " + cantPo );
      System.out.println("CANTIDAD DE NUMEROS N (NEGATIVOS) " + cantN );
      System.out.println("PORSENTAJE DE NUMEROS P (POSITIVOS): "+"%"+ porse );
      
  
    }

    
}
