import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaHarjoitus3Main {
    public static String[] nimet = {"Tara", "Catarina", "Riku",
            "Tessa", "Suri", "Sandra", "Robin"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Uusi luettelo
        Luettelo2 luettelo = new Luettelo2();
        // Katsotaan että tulostus onnistuu
        luettelo.jarjesta();
        luettelo.tulostaKaikki();
        luettelo.poistaPäät();
        System.out.println("-------------");
        // Katsotaan että poistuivat
        luettelo.tulostaKaikki();
        // Kokeillaan etsiä
        Henkilo hlo = new Henkilo("John", "Doe", 1);
        
        if (luettelo.onkoNimea(hlo)) {
            System.out.println(hlo + " löytyi");
        } else {
            System.out.println(hlo + " ei löydy");
        }
        // Esimerkki siitä että jos jäsenmuuttujan palauttaa,
        // niin sen sisältöä voi muuttaa olion ulkopuolella
        luettelo.getLista().clear();
        luettelo.tulostaKaikki();
    }
}
