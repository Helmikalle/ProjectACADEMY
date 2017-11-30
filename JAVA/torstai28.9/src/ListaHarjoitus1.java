import java.util.ArrayList;
import java.util.List;

public class ListaHarjoitus1 {

    public static void main(String[]args){
        List<String> lista = new ArrayList<>();
        lista.add("kalle");
        lista.add("outi");
        lista.add("eliel");

        for (String nimet:lista) {
            System.out.print("Listan nimi: ");
            System.out.println(nimet);

        }

    }
}
