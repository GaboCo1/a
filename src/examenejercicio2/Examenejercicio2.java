/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenejercicio2;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author OMNISPORT
 */
public class Examenejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
           double [] produc = new double [3];
         int  [] codprod = new int [3];
         String[] nombprod = new String[3];
         int i=0;
         double [] precprod = new double [3];
         int [] tipo = new int[3];
         int contUsado=0;
         int conNuevo=0;
         int [] cateprod= new int [3];
         double [] costprod= new double[3];
         double total=0;
         double totalDes=0;
         int accjj=0;
         
       for(i=0; i< produc.length; i++){
       
    System.out.println("escriba el codigo del producto "+(i+1)+ " a ingresar: "); 
    codprod[i]=leer.nextInt();
    System.out.println("escriba el nombre del producto "+(i+1)+ " a ingresar: "); 
    nombprod[i]=leer.next();
    System.out.println("Ingrese el precio del producto "+(i+1)+ " a ingresar: "); 
    precprod[i]=leer.nextDouble();
    System.out.println("escriba el tipo del producto "+(i+1)+ " a ingresar:"
            + "\n 1=nuevo \n 2=Usado "); 
    tipo[i]=leer.nextInt();
    
    if (tipo[i]==1){
        contUsado++;
    }
    if (tipo[2]==2){
     
        conNuevo++;
    }
     
    System.out.println("escriba la categoria del producto "+(i+1)+ " a ingresar:"
            + "\n 1=Hogar \n 2=Juguetes \n 3=tecnologuia ");
    cateprod[i]=leer.nextInt();
    
    if(cateprod[i]==1){
        cateprod[i]=10;
    }
    if(cateprod[i]==2){
        
        
        cateprod[i]=20;
        accjj ++;
    }
    if(   cateprod[i]==3){
       
           cateprod[i]=30;
    }
    total =+ precprod[i] + total;
    totalDes=+    cateprod[i] + totalDes;
    
     }
            for(i=0; i< produc.length; i++){
     
         System.out.println("Codigo del producto"+(i+1)+ ": " + codprod[i]);
         System.out.println("Nombre del producto"+(i+1)+ ": " + nombprod[i]); 
         if(tipo[i] == 1){
         System.out.println("Tipo del producto"+(i+1)+": Nuevo");
         }
         else if(tipo[i] == 2){
         System.out.println("Tipo del producto"+(i+1)+": Usado");
         }
         System.out.println("Precio del producto"+(i+1)+ ": " + precprod[i]);
         if(cateprod[i]==1){
         System.out.println("Categoria del producto"+(i+1)+": Hogar");
         }
         else  if(cateprod[i]==2){
         System.out.println("Categoria del producto"+(i+1)+": Juguetes");
         } 
         else  if(cateprod[i]==4){
         System.out.println("Categoria del producto"+(i+1)+": Tecnologuias");
         } 
 }
         System.out.println("Cantidad de productos usados"+(i+1)+ ": " + contUsado);  
         System.out.println("Cantidad de productos juguetes"+(i+1)+ ": " + accjj);
         System.out.println("monto final: " + (total+totalDes));
       }
    }
    
    
    
    

