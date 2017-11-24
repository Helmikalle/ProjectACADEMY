import java.io.*;

public class Tiedostonlukija {



    public static void main(String[]args){
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Tiedostonlukija lukija = new Tiedostonlukija();
    String s = null;
    try {
        s = in.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
    lukija.lueTiedosto(s);
}
    public void lueTiedosto(String nimi) {
        String tulos = "";
        try {
            FileReader lukija = new FileReader(nimi);
            BufferedReader in = new BufferedReader(lukija);
            tulos = in.readLine();
            in.close();
            lukija.close();
        } catch (IOException ex) {
            System.out.println("IO-virhe:\n" + ex);
        }
        System.out.println(tulos);
    }
}
