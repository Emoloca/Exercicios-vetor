package vetores;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
	    int a[], cont, v, text, s;
	    
	    a = new int[10];
  
	    
	    for(cont=0; cont<10; cont++) {
	    	s = cont + 1;
	    	System.out.println("digite "+s+"° valor do  elemento do vetor");
	    	a[cont] = entrada.nextInt();
	    }
	   text = 0;

	   
	   for(cont=0; cont<10; cont++) {
		   v = a[cont] - 1;
		   
		   while(v > 1) {
		 
			   if(a[cont] % v  == 0){                        
				   text++;
			   
			   }		   
			   v--;
		   			   
		   }

	   	if(text == 0) {
	   		System.out.println("Seu numero é primo");
	   	}else {
	   		System.out.println("Seu numero não é primo");

	   	}

	   }
	}}

