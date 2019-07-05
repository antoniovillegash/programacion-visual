package practica2;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Stack;

public class VisualPractica3 {
    private static final Scanner scanner = new Scanner(System.in);

    
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("ingresar el tamaño del arreglo");
    	int size=scanner.nextInt();
    	int[] arreglo=new int[size];
    	System.out.println("ingresar la cantidad de operaciones");
    	int operaciones=scanner.nextInt();
    	int[][] matriz=new int[operaciones][3];
    	
    	for(int i=0; i<operaciones; i++) {
    		System.out.println("ingresar el rango 'a' del arreglo");
    		matriz[i][0]=scanner.nextInt()-1;
        	System.out.println("ingresar el rango 'b' del arreglo");
        	matriz[i][1]=scanner.nextInt();
        	System.out.println("ingresar la cantidad a sumar");
        	matriz[i][2]=scanner.nextInt();
        	
        	for(int j=matriz[i][0]; j<matriz[i][1]; j++) {
        		arreglo[j]+=matriz[i][2];
        	}
        	for(int k=0; k<arreglo.length; k++) {
        		System.out.println("arreglo: "+arreglo[k]);
        	}
        	
        	
    	}
    	int mayor=arreglo[0];
    	for(int i=0; i<operaciones; i++) {
    		if(arreglo[i]>mayor) {
    			mayor=arreglo[i];
    		}
    	}
    	System.out.println("mayor: "+mayor);
    	
    	
    }
}
