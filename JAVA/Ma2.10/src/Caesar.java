import java.util.Arrays;
import java.util.List;

public class Caesar {

    public static void main(String[] args) {

        String merkkijono = "salainen";
        Caesar salaaja = new Caesar();
        String salattu = salaaja.salaa(merkkijono);
        System.out.println(salattu);


    }
    private String salaa(String merkkijono) {
        String uusi = "";
        for (int i = 0; i < merkkijono.length(); i++) {
            char uusimerkki =(char)(merkkijono.charAt(i)+3);
            uusi += uusimerkki;

        }return uusi;








    }}
