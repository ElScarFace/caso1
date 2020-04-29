package caso1;
import java.util.Scanner;
public class caso24 {
	//renzo delgado c.//
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ingrese primer monto: ");
float pri=sc.nextFloat();
System.out.println("ingrese segundo monto: ");
float secu=sc.nextFloat();
System.out.println("ingrese ultimo monto: ");
float ulti=sc.nextFloat();

float part=(float)(pri/5+secu*0.2);
float ter=(float)(ulti*0.6/2);
float todo=(float)(pri+secu+ulti-0.08);
System.out.println("primero: "+part);
System.out.println("segundo: "+ter );
System.out.println("terceero: "+todo);

	}

}
