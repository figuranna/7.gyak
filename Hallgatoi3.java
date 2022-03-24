/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hallgatoi3;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
/**
 *
 * @author serto
 */
public class Hallgatoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            try (FileReader be = new FileReader("fájl.txt")) {
                int c;
                out.println(be.getEncoding()); //Kiírjuk a fájl kódolását.
                while ((c = be.read()) != -1) {
                    out.print((char)c);
                }
                out.println("\n");
                be.close();
            }
        }
        catch (IOException error){
            err.println(error.getMessage());
        }
    }
    
}
