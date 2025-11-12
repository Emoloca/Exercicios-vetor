package vetores;

import java.util.Scanner;

public class Exc1Nãopronto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a[], cont, b[], elemento;

	    a = new int[20];
	    b = new int[20];
	    
	    
	    elemento = 1;
	    
		   for(cont=0; cont<20; cont++) {
			   System.out.println("Digite o valor do "+elemento+"º elemento armazenado no vetor A");
			   a[cont] = entrada.nextInt();
		
			   System.out.println(a[cont]);
			   elemento++;
			   
			   if(a[cont] % 2 == 0) {
				   b[cont] = a[cont];
						   System.out.println(b[cont]+"par");
			   }else {
				   b[10] = a[cont];
				   System.out.println(b[cont]+"impar");

			   }
		   }
      
        entrada.close();
    }
}
