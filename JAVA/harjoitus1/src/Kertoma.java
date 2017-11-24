
import java.util.Scanner;

public class Kertoma{
    public static void main(String[] args) {

        long luku;
        // halutaan sulkea Scanner, joten try with resources
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Anna luku, jolle kertoma lasketaan: ");
            luku = in.nextLong();
        } catch (Exception e) {
            System.err.println("Ongelma lukemisessa: " + e.getMessage());
            System.err.println("Lopetetaan..");
            return;
        }
        System.out.println(String.format("%d! on: %d", luku, kertoma(luku)));
    }

    private static Object kertoma(long luku) {
        long tulos=1;
        for (int i = 1; i <=luku ; i++) {
            tulos *=i;

        }
        return tulos;
    }

}



