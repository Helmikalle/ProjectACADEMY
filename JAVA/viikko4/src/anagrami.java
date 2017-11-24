import java.util.Arrays;
import java.util.Scanner;

public class anagrami {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner lukija = new Scanner(System.in);
            System.out.println("anna eka sana");
            String eka = lukija.nextLine();
            System.out.println("Anna toka");
            String toka = lukija.nextLine();
            if (eka.equalsIgnoreCase("lopeta")) {
                break;
            } else {
                if (eka.length() != toka.length()) {
                    System.out.println("WROOONG");
                } else {
                    eka = eka.toLowerCase();
                    toka = toka.toLowerCase();
                    char[] jono1 = eka.toCharArray();
                    char[] jono2 = toka.toCharArray();
                    Arrays.sort(jono1);
                    Arrays.sort(jono2);
                    String ekaJono = new String(jono1);
                    String tokaJono = new String(jono2);
                    if (ekaJono.equals(tokaJono)) {
                        System.out.println("ITS A MATCH");
                    } else {
                        System.out.println("ei natsannu");
                    }

                }


            }
        }
    }
}
