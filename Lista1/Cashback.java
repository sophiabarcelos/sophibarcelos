import java.util.Scanner;
public class Cashback {
   public static void main (String argns[]) {
	   Scanner ler= new Scanner (System.in);
	   double c,t,desc;
	   System.out.println("Digite o valor da sua compra:");
	   c=ler.nextDouble();
	   
	  
	  if (c <= 100) {
		  t= c/5;
		  System.out.println("Sua compra tem 5% de cashback");
		  
	  }else if (c <= 1000) {
		  t=c/8;
		  System.out.println("Sua compra tem 8% de cashback");
		  
	  }else if (c <=2000) {
		  t=c/10;
		  System.out.println("Sua compra tem 10% de cashback");
		  
	  }else if (c<= 5000) {
		  t=c/12.5;
		  System.out.println("Sua compra tem 12,5% de cashback");
		  
	  }else {
		  t=c/15;
		  System.out.println("Sua compra tem 15% cashback ");
	  }
		  
}
}