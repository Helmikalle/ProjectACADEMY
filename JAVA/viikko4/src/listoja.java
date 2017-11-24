import java.text.Collator;
import java.util.*;

public class listoja {
    public static void main(String[] args) {

        char[] kirjaimet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<String> lista = new ArrayList<>();

        Collator coll = Collator.getInstance(Locale.forLanguageTag("fi"));
        coll.setStrength(Collator.PRIMARY);
        String lista2 = "A,E,I,O,U,Y,Ä,Ö".toLowerCase();
        List<String> vokaalit = new ArrayList<String>(Arrays.asList(lista2.split(",")));
        List<String> vokaalit2 = new ArrayList<String>(Arrays.asList(lista2.split(",")));
        for (int i = 0; i < kirjaimet.length; i++) {
            lista.add(String.valueOf(kirjaimet[i]));

        }

        System.out.println(vokaalit);
        Collections.shuffle(lista);
        System.out.println(lista);
        System.out.println(lista.indexOf("m"));
        int a = lista.indexOf("a");
        int b = (a);
        int c = a+2;
        lista.add(b, "å");
        lista.add(c, "ä");
        lista.add(0, "ö");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.removeAll(vokaalit);
        System.out.println(lista.size());
        System.out.println(lista);
        lista.addAll(vokaalit2);
        System.out.println(lista);
        Collections.sort(lista,coll);
        System.out.println(lista);
         }
}
