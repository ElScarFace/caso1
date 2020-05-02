package caso1;
import java.util.Scanner;
public class caso23 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("ingrese nombre del producto: ");
String nom =sc.nextLine();
System.out.println("ingrese el precio del producto: ");
float precio=sc.nextFloat();
System.out.println("ingrese la cantidad de productos: ");
float cantidad=sc.nextFloat();
float importe=precio*cantidad;
float igv=(float)(importe*0.18);
float desc=(float)(importe*0.03);
float total= importe-desc+igv;

System.out.println("el importe es: "+importe);
System.out.println("el igv es: "+igv);
System.out.println("el descuento es: "+desc);
System.out.println("el total es: "+total);

	}

}
