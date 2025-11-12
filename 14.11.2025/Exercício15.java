package vetores;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        
	    int a[], cont, e = 13, num, valor, son, contador, elemento;

	    a = new int[10];


	    

	    
		   
	    for(cont=0; cont<10; cont++) {
		
	    	a[cont] = e;
		
	    	
			
	    	e = e + 13;
		   
	    }
		   
		
	    elemento = 1;		
	    son = 0;		
	    cont = 0;
		   
		
	    while(son < 2) {			   		
	    	System.out.println("Digite o valor que deseja consutar:");
			
	    	valor = entrada.nextInt();
			   			
	    	if (valor == a[cont]){
	    		System.out.println("Seu numero está presente no vetor, está no "+elemento+"º elemento ");
					 		   
	    	}else {			
	    		System.out.println("O numero digitado não está prensente no vetor A");		   
	    	}
	    	
	    	cont++;
			   			
	    	System.out.println(" ");			
	    	System.out.println("Deseja continuar?");			
	    	System.out.println("1 = sim");			
	    	System.out.println("2 = não");
			
	    	son = entrada.nextInt();				    			   
	    }		   	
    }
}
