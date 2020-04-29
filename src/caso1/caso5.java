package caso1;
import java.util.Scanner;
public class caso5 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
float n1=0, n2=0;
System.out.println("ingrese primer numero: ");
n1=sc.nextFloat();
System.out.println("ingrese segundo numero: ");
n2=sc.nextFloat();
System.out.println("---------");
System.out.println("resultados");
System.out.println("---------");
System.out.println("resultado1: "+ (n1+n2)/2);
System.out.println("resultado2: "+ (n1+n1*0.2));
System.out.println("resultado3: "+ (n2-n2*0.3));
	}

}
