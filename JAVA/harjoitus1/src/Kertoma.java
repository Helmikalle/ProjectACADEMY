
import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {

            long luku = 0;
            // halutaan sulkea Scanner, joten try with resources
            try (Scanner in = new Scanner(System.in)) {
               for (;;){
                System.out.print("Anna luku, jolle kertoma lasketaan. Nolla lopettaa: ");
                luku = in.nextLong();
                if(luku > 0){
                System.out.println(String.format("%d! on: %d", luku, kertoma(luku)));
                }else {
                    System.out.println("Hei hei.");
                    break;
                }
                }
            } catch (Exception e) {
                System.err.println("Ongelma lukemisessa: " + e.getMessage());
                System.err.println("Lopetetaan..");
                return;
            }

        }


    private static Object kertoma(long luku) {
        long tulos = 1;
        for (int i = 1; i <= luku; i++) {
            tulos *= i;

        }
        return tulos;
    }

}



