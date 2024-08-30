import java.util.*;
public class Tabuada {
      public static void main(String[] args) {
    	  Scanner ler=  new Scanner (System.in);
		int i =1, num, res;
		System.out.println("Digite o número desejado para saber a tabuada do mesmo:");
		num =ler.nextInt();
		while (i<11) {
	        res = num* i;
	        System.out.println(res + "x" + i + "= " +  res);
			i++;
		}
	}
}
