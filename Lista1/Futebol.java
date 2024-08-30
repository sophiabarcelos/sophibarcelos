import java.util.Scanner;
public class Futebol {
  public static void main (String args[]) {
	  Scanner ler= new Scanner (System.in);
	  double n,id;
	  
	  System.out.println("Digite seu ano de nascimento");
	  n=ler.nextDouble();
	  
	  id = 2024-n;
	
	  
	
	  if(n<= 6) {
		 
		  System.out.println("Dente de leite");
		  
	  }else if ( id<=10) {
		  
		  System.out.println("Infantil 1");
		  
	  }else if (id<= 14) {
		  
		  System.out.println("Infantil 2");
		  
	  }else if (id<=16) {
		  
		  System.out.println("Juvenil 1");
		  
	  }else if (id<=17) {

		  System.out.println("Juvenil 2");
		  
	  }else if(id >17) {
		
		  System.out.println("Não é permitido maiores de 18");
	  }
	  ler.close();
}
}
