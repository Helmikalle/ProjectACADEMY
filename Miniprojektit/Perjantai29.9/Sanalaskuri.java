import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sanalaskuri {
    public static void main(String[] args) {
        String tiedostonnimi;
        if (args.length > 0) {
            tiedostonnimi = args[0];
        } else {
            System.out.println("Käytetään oletustiedostonimeä");
            tiedostonnimi = "hedelmia";
        }
        Sanalaskuri laskuri = new Sanalaskuri();
        laskuri.kasitteleTiedosto(tiedostonnimi);
        //laskuri.lueTiedosto(tiedostonnimi);


    }

    /**
     * public void lueTiedosto(String nimi) {
     * <p>
     * try (BufferedReader kahva = new BufferedReader(new FileReader(nimi))) {
     * for(String rivi = kahva.readLine() ; rivi != null ; rivi=kahva.readLine()) {
     * String[] sanat = rivi.split("\\W+");
     * for(String sana : sanat) {
     * <p>
     * if(!sana.isEmpty())
     * System.out.println(sana);
     * }
     * }
     * } catch (FileNotFoundException e) {
     * e.printStackTrace();
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     * }
     **/


    private void kasitteleTiedosto(String nimi) {
        int sanat = 0, merkit = 0, rivit = 0;
        try (BufferedReader lukija = new BufferedReader(new FileReader(nimi))) {
            for (String rivi = lukija.readLine(); rivi != null; rivi = lukija.readLine()) {
                rivit++;  // rivit = rivit + 1;  rivit += 1;
                merkit += rivi.length() + 1;
                String[] sanatrivilla = rivi.split("\\W+");
                int sanoja = sanatrivilla.length;
                sanat += sanoja;
                for (String sana : sanatrivilla) {
                    Map<String, Integer> kartta = new HashMap<String, Integer>();
                    if (kartta.containsKey(sana)) {

                        kartta.put(sana,1);
                    } else
                        kartta.put(sana, 1);

                    for (String avain : kartta.keySet()) {
                        int alkio = kartta.get(avain);
                        System.out.println(sana + alkio);
                    }

                }


            }

            System.out.println("------ " + nimi + " -------");
            System.out.println("\t" + rivit + "\t" + sanat + "\t" + merkit);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
