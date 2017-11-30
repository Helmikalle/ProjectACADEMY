import java.io.*;

public class Kirjoituskone {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        String tekstia = null;
        File tiedosto = new File("moi.txt");

        try {
            System.out.println(tiedosto.getCanonicalPath());
            for (; ; ) {
                if ("0".equals(tekstia)) {
                    break;
                } else {
                    tekstia = in.readLine();
                    writer = new BufferedWriter(new FileWriter(tiedosto, true));
                    writer.write(tekstia);
                    writer.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
