package caso1;

import java.util.Scanner;

public class caso9 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int lado=0, lado2=0;
		System.out.println("ingese lado del recangulo: ");
		lado=sc.nextInt();
		System.out.println("ingese segundo lado de rectngulo: ");
		lado2=sc.nextInt();
		System.out.println("----------");
		System.out.println("resultados");
		System.out.println("-----------");
		System.out.println("area del rectangulo: "+ lado*lado2);
		System.out.println("perimetro: "+2*(lado+lado2));
	}

}
