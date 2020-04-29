package caso1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso17 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
DecimalFormat df= new DecimalFormat("#.00");
System.out.println("numeros de aprovados: ");
float apro=sc.nextFloat();
System.out.println("numero de desaprobados: ");
float desa=sc.nextFloat();
System.out.println("numero de retirados: ");
float reti=sc.nextFloat();
 
float total=apro+desa+reti;
float aprova=apro/total*100;
float desap=desa/total*100;
float retira=reti/total*100;

System.out.println("aprovados: "+ aprova);
System.out.println("desaprovados: "+desap);
System.out.println("retirados: "+retira);


	}

}
