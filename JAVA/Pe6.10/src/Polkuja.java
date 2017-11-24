import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Polkuja {
    public static void main(String[] args) throws IOException {
        //String o = System.getProperty("user.home");
        Path polku = Paths.get(System.getProperty("user.home"));
        DirectoryStream<Path> hak = Files.newDirectoryStream(polku);
        for (Path p : hak) {
            if (Files.isRegularFile(p)){
                System.out.println("JOTAIN: " + p);

            }
        }

        System.out.println("------------");
        File työ = new File(System.getProperty("user.home"));
        if (työ.isDirectory()) {
            for (File file : työ.listFiles()) {
                String kuvaus = file.isFile() ? "Normitiedosto" : "Hakemisto:";
                System.out.println(kuvaus + " " + file.getName());
            }
        }

    }
}
