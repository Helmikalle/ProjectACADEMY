import java.awt.*;

public class vareja {
    public static void main(String[] args) {
        String vari = "#ce408c";
        int r = 90;
        int g = 15;
        int b = 90;
        String hex = String.format("#%02x%02x%02x", r, g, b);
        System.out.println(hex);
        System.out.println(muunnos(vari));
    }
    public static Color muunnos (String vari){
        return new Color(
                Integer.valueOf(vari.substring(1,3),16),
                Integer.valueOf(vari.substring(3,5),16),
                Integer.valueOf(vari.substring(5),16)
        );
    }
}
