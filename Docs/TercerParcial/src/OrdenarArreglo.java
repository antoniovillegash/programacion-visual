import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class OrdenarArreglo {
	public static void main(String[] args) {
		
		String cadena;
		ArrayList<Character> arreglo = new ArrayList<Character>();
		cadena= JOptionPane.showInputDialog("ingrese los datos binarios: ");
		for (char c : cadena.toCharArray()) {
			  arreglo.add(c);
			}
		Collections.sort(arreglo);
		JOptionPane.showMessageDialog(null, "arreglo ordenado: \n"+Arrays.toString(arreglo.toArray()));
	}

}
