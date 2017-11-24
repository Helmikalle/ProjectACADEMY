import java.util.ArrayList;
import java.util.List;

public class ListaHarjoitus1 {

    public static void main(String[]args){
        List<String> lista = new ArrayList<String>();
        lista.add("Kalle");
        lista.add("Outi");
        lista.add("Eliel");

        for (String nimet:lista) {
            System.out.print("Listan nimi: ");
            System.out.println(nimet);

        }

    }
}
