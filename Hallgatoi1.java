/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hallgatoi1;
import static java.lang.System.out;
import static java.lang.System.err;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author serto
 */
public class Hallgatoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String szoveg;
        Scanner billentyu = new Scanner (System.in);
        out.println("Szöveg: ");
        szoveg = billentyu.next();
        try { try (FileWriter ki = new FileWriter("fájl.txt")) { //Fájl megnyitás)
            int i = 0;
            while(i < szoveg.length()) {
                int c = szoveg.charAt(i++); // A sztring i. karaktere
                ki.write(c); // Egy karakter kiírása
                }
                ki.close(); //Fájl lezárás
                }
            }
            catch (IOException error){ //Általános I/O hiba
                err.println(error.getMessage()); //Hiba kiírása
            }
            try { try (FileReader be = new FileReader("fájl.txt")){ // Fájl megnyitás
                int c;
                out.print("\n\nSzöveg kiírva: ");
                while ((c = be.read()) != -1) { //Egy karakter olvasás, EOF végjelig
                    out.print((char)c); //Karakter kiírás a képernyőre
                }   
                out.println("\nKarakterek száma: " + szoveg.length());
                be.close(); //Fájl lezárás
            }
            }
            catch (IOException error){ //Általános I/O hiba
                err.println(error.getMessage()); //Hiba kiírása
            } 
    }
    
}
