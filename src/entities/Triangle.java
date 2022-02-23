package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() { // não recebe parâmetros, pois os parâmetros que precisamos (a, b, e c) já estão na classe 
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
