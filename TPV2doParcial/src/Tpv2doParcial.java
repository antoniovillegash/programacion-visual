
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tpv2doParcial {

    public static void main(String[] args) {
        String path = "docs/";
        File file;
        if ("archivo" != null) {
            path += "/" + "archivo.txt";
            file = new File(path);
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Tpv2doParcial.class.getName()).log(Level.SEVERE, null, ex);
            }

            String content = JOptionPane.showInputDialog("Ingrese las palabras separadas por un espacio");

            try (FileWriter writer = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(content);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            if (content != null) {
                String palabras = content.trim();
                int contador = palabras.split("\\s+").length;

                String[] ar = content.split("\\s");
                Map<String, Integer> mp = new HashMap<String, Integer>();
                int count = 0;

                for (int i = 0; i < ar.length; i++) {
                    count = 0;
                    for (int j = 0; j < ar.length; j++) {
                        if (ar[i].equals(ar[j])) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        mp.put(ar[i], count);
                    }
                }

                Scanner in;
                try {
                    in = new Scanner(new FileReader(file));
                    StringBuilder sb = new StringBuilder();
                    while (in.hasNext()) {
                        sb.append(" " + in.next());
                    }
                    in.close();
                    String text = sb.toString();
                    JOptionPane.showMessageDialog(null, "Palabras: " + text + "\nNumero de palabras: " + contador + "\nPalabras repetidas: " + mp);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Tpv2doParcial.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

}
