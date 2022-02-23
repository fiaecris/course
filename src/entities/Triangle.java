package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() { // n�o recebe par�metros, pois os par�metros que precisamos (a, b, e c) j� est�o na classe 
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
