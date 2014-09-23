import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 */


public class Main {

	public static void main (String args[]) {

		double radio; 
		double resultadoArea, resultadoCircun;
		Circulo operaciones = new Circulo();

		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio: ");
		radio = sc.nextDouble();

		resultadoArea = operaciones.area(radio);
		resultadoCircun = operaciones.circun(radio);

		System.out.println("\nEl AREA es: " + resultadoArea);
		System.out.println("\nLa CIRCUNFERENCIA es: " + resultadoCircun);

		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}