package caso1;

import java.util.Scanner;

public class caso21 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);

		System.out.println("ingrese gasto:");
		float precio=sc.nextFloat();
		float venta=(float) (precio-precio*0.12);
		System.out.println("disminuido en 12%: "+venta);
	}

}
