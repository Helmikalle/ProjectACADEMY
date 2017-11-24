import java.util.*;

public class Kielet {

    public static void main(String[] args) {
        Locale suomi = new Locale("fi","FI");
        Locale [] lokaalit = Locale.getAvailableLocales();
        System.out.println(Locale.getDefault().getDisplayName(suomi));
        Set<String> kielet = new TreeSet<>(); //TreeSet aakkosjärjestyksessä
        for (int i = 0; i <lokaalit.length ; i++) {
            System.out.println(lokaalit[i].getDisplayName(suomi));
            kielet.add(lokaalit[i].getLanguage());
            
        }
        System.out.println("Yhteensä : " + lokaalit.length);
        System.out.println("Kieliä: " + kielet.size() );
        for (String kieli :kielet) {
            System.out.println(kieli);
        }
    }
}
