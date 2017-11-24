import java.io.*;

public class Kirjoituskone {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try {
            name = br.readLine();
        } catch (IOException e) {
            name = "?";
            e.printStackTrace();
        } finally {
            try { br.close(); } catch (IOException e){ e.printStackTrace();}
        }
        System.out.println(name);
    }
}