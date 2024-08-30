import java.util.Scanner;
public class Inss {
	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		double ren, inss;
		
		System.out.println(" Digite sua renda mensal");
		ren=ler.nextDouble();
		
		if (ren<= 1412) {
			inss= (ren /100) *7.5;
			System.out.println("o valor do sue inss é" + inss);
		}
			
		else if (ren<= 2666) {
				inss= (ren /100) * 9;
				System.out.println("o valor do sue inss é" +  inss);
		}	
		else if (ren<= 4000) {
					inss= (ren /100) * 12;
					System.out.println("o valor do sue inss é"+ inss);
				}
					
		else if (ren<= 7786) {
						inss= (ren /100) *12;
						System.out.println("o valor do sue inss é"+ inss);
					}
						
		else {
					    inss=(ren /100) * 14;
						System.out.println("o valor do sue inss é"+ inss);
		}
						
					
					ler.close();
	}
}

  


 