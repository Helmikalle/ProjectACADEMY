import java.io.*;

public class Kirjoituskone {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//syötteen lukija
        BufferedWriter writer; //syöttää tekstiä tiedostoon
        String tekstia = null;
        File tiedosto = new File("moi.txt"); //tiedoston nimi

        try {
            System.out.println(tiedosto.getCanonicalPath());
            for (; ; ) {
                if ("0".equals(tekstia)) { //aika loppu kesken mutta voi antaa koodia kunnes syöttää nollan
                    break;
                } else {
                    tekstia = in.readLine();
                    writer = new BufferedWriter(new FileWriter(tiedosto, true));
                    writer.write(tekstia + " ");
                    writer.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
