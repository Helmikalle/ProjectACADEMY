import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sanalaskuri {
    public static void main(String[]args){
        String tiedostonnimi;
        if(args.length>0){
            tiedostonnimi = args [0];
        }else{
            System.out.println("Oletus");
            tiedostonnimi = "moi.txt";
        }
        Sanalaskuri laskuri = new Sanalaskuri();//pääsee käsiksi non static
        laskuri.kasitteleTiedosto(tiedostonnimi);//samaa asiaa

    }

    private void kasitteleTiedosto(String nimi) {
    int sanat=0, merkit=0, rivit=0;
    String rivi;
        try {
            BufferedReader lukija=new BufferedReader(new FileReader(nimi));
            for(rivi = lukija.readLine() ; rivi !=null; rivi = lukija.readLine());
            rivit++;
            merkit += rivi.length();
            String [] sanatrivilla = rivi.split(" ");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
