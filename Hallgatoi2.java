/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hallgatoi2;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author serto
 */
public class Hallgatoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nev;
        Scanner billentyu = new Scanner (System.in, "ISO8859_2");
        try{ try (PrintStream file = new PrintStream("Fájl.txt")){
            out.print("Kérek egy nevet: ");
            nev = billentyu.nextLine();
            while(nev.length()!=0){
                file.println(nev);
                out.print("Kérek egy nevet: ");
                nev = billentyu.nextLine();
            }
        }
        }
        catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
        try (Scanner file = new Scanner(new File("Fájl.txt"))) {
            int i = 0;
            while(file.hasNext()) { // Van még adat?
                out.println(file.nextLine());
                i++;
            }
            out.println("Sorok száma: " + i);
            file.close();
        }
        catch (IOException error) {
            System.err.println("Hiba: " + error.getMessage());
        }
    }
    
}
