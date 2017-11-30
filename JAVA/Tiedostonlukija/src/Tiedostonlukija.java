import java.io.*;

public class Tiedostonlukija {


    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //voisi olla myös scanner
        Tiedostonlukija lukija = new Tiedostonlukija();
        String s = null;
        try {
            System.out.println("Anna tiedoston nimi: ");
            s = in.readLine(); //tähän syötetään tiedosto
        } catch (IOException e) {
            e.printStackTrace();
        }
        lukija.lueTiedosto(s);
    }

    public void lueTiedosto(String nimi) {
        String tulos = null;
        try {
            FileReader lukija = new FileReader(nimi); //Avaa tiedoston
            BufferedReader in = new BufferedReader(lukija); // Pistää tavaraa jonoon ja lukee
            tulos = in.readLine();//Tulostaa
            in.close();//sulkee BufferedReaderin
            lukija.close(); //sulkee FileReaderin
        } catch (IOException ex) {
            System.out.println("IO-virhe:\n" + ex);
        }
        System.out.println(tulos);
    }
}
