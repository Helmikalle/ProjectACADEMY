import java.util.*;
import java.util.Iterator;
import java.util.List;

class Luettelo {
    private List<String> lista;
    /**
     * Luo listan ja alustaa sen. Listan alustuksessa
     * käytetään <code>ListaHarjoitus2</code>-luokan
     * <code>nimet</code> muuttujaa.
     */
    public Luettelo() {
        this.lista = new ArrayList<>();
        lista.addAll(Arrays.asList(ListaHarjoitus2.nimet));//näin mielummin seems easier :P

    }



    /**
     * Luettelon tulostus.
     * Metodi tulostaa tiedon siitä montako nimeä listassa on,
     * sen jälkeen kaikki listan nimet yksi kerrallaan.
     */
    public void tulostaKaikki() {
        int lkm=lista.size();
        System.out.println(lkm);

        for (String nimi:lista) {
          System.out.println(nimi);
        }
    }
    /**
     */
    public void poistaPäät() {
        lista.remove (0);
        lista.remove (lista.size()-1);
        }
    /**
     * Metodilla voi etsiä nimeä listasta.
     *
     * @param nimi Nimi, jota halutaan etsiä
     * @return true jos nimi on listassa, muuten false
     */
    public boolean onkoNimea(String nimi) {
        return lista.contains(nimi);
    }
    public List<String> getLista() {
        return lista;
    }
    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
