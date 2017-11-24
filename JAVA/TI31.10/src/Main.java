import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna luku:");
        Long luku = sc.nextLong();
        System.out.println(String.format("%d! on: %d", luku, kertoma(luku)));
    }

    private static Long kertoma(Long luku) {
        long tulos = 1;
        for (long i = 1; i <=luku ; i++) {
            tulos = tulos *i;

        }
        return tulos;
    }
}