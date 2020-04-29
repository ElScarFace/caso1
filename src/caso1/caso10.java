package caso1;

import java.util.Scanner;

public class caso10 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		float radio=0;
		System.out.println("ingese radio del circulo: ");
		radio=sc.nextInt();
		System.out.println("----------");
		System.out.println("resultados");
		System.out.println("-----------");
		System.out.println("area del circulo: "+ 3.1415*(float) Math.pow(radio ,2));
		System.out.println("perimetro: "+2*3.1415*radio);
	}

}
