package vetores;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a[], b[], c[], cont, s, num;
        
        
       

	    a = new int[10];
	    b = new int[10];
	    c = new int[10];
	   	
	  
      
	    
	    for(cont=0; cont<10; cont++) {
	    
	    	s = cont + 1;
	    	
	    	System.out.println("digite "+s+"° valor do  elemento do vetor A");
	    	a[cont] = entrada.nextInt();
	    	
	    	
	    	System.out.println("digite "+s+"° valor do  elemento do vetor B");
	    	b[cont] = entrada.nextInt();
	    	
	    	if(a[cont] == b[cont]) {
	    		
	    	}else if (a[cont] < b[cont]){
	    		
	    	}
	    	
	    	System.out.println("A "+a[cont]+" - B "+b[cont]+" - C "+c[cont]);
	    }
    }
}
