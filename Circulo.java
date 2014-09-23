/*
 * Clase para obtener resultados del area y la circunferencia.
 */
public class Circulo {

//Método que haya el area.
 public double area (double radio) {

	double result = 0;
	result = 3.1416 * (radio * radio);
	return result;
}

//Método que haya la circunferencia.
 public double circun (double radio) {

	double result = 0;
	result = (3.1416 * 2) * radio;
	return result;
}

}