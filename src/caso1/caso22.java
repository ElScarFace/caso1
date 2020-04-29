package caso1;
import java.util.Scanner;
public class caso22 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("ingrese nombre del alumno: ");
String nombre=sc.nextLine();
System.out.println("ingrese nota 1: ");
float nota1=sc.nextFloat();
System.out.println("ingrese nota 2: ");
float nota2=sc.nextFloat();
System.out.println("ingrese nota 3: ");
float nota3=sc.nextFloat();
float uno=(float) (nota1*0.2);
float dos=(float) (nota2*0.3);
float tres=(float) (nota3*0.5);
float promedio=uno+dos+tres;

System.out.println("el promedio es: "+promedio );


	}


	}


