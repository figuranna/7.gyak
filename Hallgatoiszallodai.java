/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hallgatoiszallodai;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author serto
 */
public class Hallgatoiszallodai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner billentyu = new Scanner (System.in);
        int i;
        int lakok;
        int ar;
        String nev;
        String sor;
        try {
            PrintWriter out = new PrintWriter("c:fájl.txt");
            System.out.print("kérem a szoba sorszámát: ");
            i=billentyu.nextInt();
            while (i != 0){
                System.out.print("kérem a nevet: ");
                nev=billentyu.next();
                System.out.print("kérem a lakók számát: ");
                lakok = billentyu.nextInt();
                System.out.print("kérem a szoba árát: ");
                ar = billentyu.nextInt();
                out.printf("Szobaszám: %d - Név: %s - Lakók száma: %d - Ár: %d\n",i , nev, lakok, ar);
                System.out.print("kérem a szoba sorszámát: ");
                i=billentyu.nextInt();
            }
            out.close();
        }
        catch (IOException error) {
            System.err.println(error.getMessage());
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("c:text.txt"));
            while ((sor = in.readLine()) != null) {
                System.out.println(sor);
            }
            in.close();
        }
        catch (IOException error) {
            System.err.println(error.getMessage());
        }
    }
    
}
