import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Perjantaivk2 {
    public static void main(String[] args) {
        Path polku = Paths.get("C:\\Users\\Administrator\\Desktop\\Macro\\Perjantai29.9\\src");
        Path s = Paths.get("C:\\Users\\Administrator\\Desktop\\Macro\\Perjantai29.9\\src\\Aula.java");
        System.out.println(polku);
        System.out.println(s);
        System.out.println(polku.toAbsolutePath());
        if (Files.exists(s)) {
            System.out.println(true);
        }
        if (Files.isDirectory(s)) {
            System.out.println(true);
        } else {
            Files.isRegularFile(s);
            System.out.println("datass");
        }
    }
}






