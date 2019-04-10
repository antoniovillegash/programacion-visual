
public class Rectangulo {
	protected double base;
	protected double altura;
	public Rectangulo() {
		
	}
	public Rectangulo(double altura, double base) {
		this.altura=altura;
		this.base=base;
		
	}
	public double calcularArea(double altura, double base) {
		return altura*base;
	}

}
