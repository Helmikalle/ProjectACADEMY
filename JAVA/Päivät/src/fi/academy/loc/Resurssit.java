package fi.academy.loc;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Resurssit {
    //static LocHenkilo h = new LocHenkilo("Kalle","Helminen",21.1);
    public static void main(String[] args){
        Locale r = new Locale("sv","SE");
        Locale e = new Locale("en","US");

        tulosta();
    }
    private static void tulosta() {
        LocHenkilo locHenkilo = new LocHenkilo();
        locHenkilo.setEtunimi("Kalle");
        locHenkilo.setSukunimi("Helminen");
        locHenkilo.setPalkka(10.1);

        String nimi =locHenkilo.getEtunimi()+" "+locHenkilo.getSukunimi();
        System.out.println("Hei nimeni on: " + nimi);
        System.out.println("Palkkani on: "+ locHenkilo.getPalkka());
    }
}
