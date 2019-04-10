
public class Precio extends Rectangulo{
	
	public Precio() {
		super();
	}
	public Precio(double altura, double base) {
		super(altura, base);
	}
	public double calcularPrecio(double area) {
		return area*2;
	}

}
