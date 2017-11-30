import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Luettelo {
    private List<Henkilo> lista;

    public Luettelo() {

//        lista.addAll(Arrays.asList(ListaHarjoitus2.nimet));//näin mielummin seems easier :P
        Henkilo[] hlot = {
                new Henkilo("John", "Doe", 21),
                new Henkilo("Jane", "Doe", 28),
                new Henkilo("Steven", "Tyler", 55),
                new Henkilo("Matt", "Mulligan", 21),
                new Henkilo("James", "Gosling", 55)};

        // Lisää nimet listaan
        lista = new ArrayList<>(Arrays.asList(hlot));

    }



    /**
     * Luettelon tulostus.
     * Metodi tulostaa tiedon siitä montako nimeä listassa on,
     * sen jälkeen kaikki listan nimet yksi kerrallaan.
     */
    public void tulostaKaikki() {
        System.out.println("Nimiä listassa: " + lista.size());
        for (Henkilo hlo : lista) {
            System.out.println(" - " + hlo);
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
    public List<Henkilo> getLista() {
        return lista;
    }
    public void setLista(List<Henkilo> lista) {
        this.lista = lista;
    }
}
