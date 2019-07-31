import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class alturaMaxima {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Queue<Integer> primeraPila = new LinkedList<>();
		System.out.println("ingrese el tamaño de la primera pila: ");
		int tamaño1 = scan.nextInt();
		int sum1 = 0;
		
		Queue<Integer> segundaPila = new LinkedList<>();
		System.out.println("ingrese el tamaño de la segunda pila: ");
		int tamaño2 = scan.nextInt();
		int sum2 = 0;

		Queue<Integer> terceraPila = new LinkedList<>();
		System.out.println("ingrese el tamaño de la tercera pila: ");
		int tamaño3 = scan.nextInt();
		int sum3 = 0;
		
		for(int i = 0;i<tamaño1;i++){
			
			System.out.println("ingrese el valor ["+i+"] de la primera pila");
			int valor = scan.nextInt();
			primeraPila.add(valor);
			sum1+=valor;
		}
		
		for(int i = 0;i<tamaño2;i++){
			System.out.println("ingrese el valor ["+i+"] de la segunda pila");
			int valor = scan.nextInt();
			segundaPila.add(valor);
			sum2+=valor;
		}
		
		for(int i = 0;i<tamaño3;i++){
			System.out.println("ingrese el valor ["+i+"] de la tercera pila");
			int valor = scan.nextInt();
			terceraPila.add(valor);
			sum3+=valor;
		}
		
		scan.close();
		
		
		
		while(!((sum1==sum2)&&(sum2==sum3)&&(sum1==sum3))){
			
			
			
			
			if(sum1>=sum2 && sum1>=sum3){
				
				sum1 -=primeraPila.remove();
				
			}else if(sum2 >=sum1 && sum2>=sum3){
				
				sum2 -=segundaPila.remove();
				
			}else{
				
				sum3 -=terceraPila.remove();
			}
		}
		System.out.println("Resultado: "+sum1);
	}
}
