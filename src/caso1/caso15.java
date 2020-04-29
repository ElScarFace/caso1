package caso1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso15 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
DecimalFormat df= new DecimalFormat("#.00");
System.out.println("ingrese cantidad: ");
float cantidad=sc.nextFloat();
System.out.println("ingrese precio: ");
float precio=sc.nextFloat();

float importe=cantidad*precio;
float dolares= (float) (importe/3.24);
float euros=(float) (importe/3.75);


System.out.println("-----------");
System.out.println("resultados");
System.out.println("------------");
System.out.println("importe: "+ df.format(importe));
System.out.println("en dolares: "+df.format(dolares) );
System.out.println("en euros: "+ df.format(euros));


		
		
	}

}
