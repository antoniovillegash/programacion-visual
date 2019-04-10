import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		 Scanner scan =new Scanner(System.in);
		 
		 System.out.print("ingrese la altura de la tabla\n");
		 double altura=scan.nextDouble();
		 System.out.print("ingrese la base de la tabla\n");
		 double base=scan.nextDouble();
		 
		 Precio mesa=new Precio(altura,base);
		 System.out.print("el precio de la tabla es: $ "+mesa.calcularPrecio(mesa.calcularArea(altura, base)));
	}

}
