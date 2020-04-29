package caso1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso16 {
	//renzo delgado c.//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println("ingrese horas trabajadas: ");
		float horas=sc.nextFloat();
		System.out.println("ingrese tarifa por hora: ");
		float tarifa=sc.nextFloat();

		float sueldo=horas*tarifa;
		float bono= (float) (sueldo*0.05);
		float total=(float) (sueldo+bono);
        float totaldol=(float)(total/3.24) ;

		System.out.println("-----------");
		System.out.println("resultados");
		System.out.println("------------");
		System.out.println("sueldo: "+ df.format(sueldo));
		System.out.println("bono: "+df.format(bono) );
		System.out.println("total: "+ df.format(total));
		System.out.println("total en dolares: "+ df.format(totaldol));

	}

}
