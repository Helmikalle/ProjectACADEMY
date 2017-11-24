import java.util.*;
import java.util.Iterator;
import java.util.List;

class Luettelo2 {
    private List<Henkilo> lista;
    private String etunimi;
    private String sukunimi;
    private int ika;

    public Luettelo2() {
        Henkilo[]hlot = {
                new Henkilo("John", "Doe", 21),
                new Henkilo("Jane", "Doe", 28),
                new Henkilo("Steven", "Tyler", 55),
                new Henkilo("Matt", "Mulligan", 21),
                new Henkilo("James", "Gosling", 55)
        };
// Lisää nimet listaan
        lista = new ArrayList<>(Arrays.asList(hlot));

    }


    public void tulostaKaikki() {
        for (Henkilo nimi:lista) {
            System.out.println(nimi);
        }

    }

    public void poistaPäät() {
        lista.remove (0);
        lista.remove (lista.size()-1);
    }



    public boolean onkoNimea(Henkilo hlo) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.equals(hlo)) ;
            return true;
        }
        return false;

    }
    public List<Henkilo> getLista() {
        return lista;
    }
    public void setLista(List<Henkilo> lista) {

        this.lista = lista;
    }

    public String getEtunimi() {

        return etunimi;
    }

    public void setEtunimi(String etunimi) {

        this.etunimi = etunimi;
    }

    public String getSukunimi() {

        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {

        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        return "Luettelo2{" +
                "lista=" + lista +
                ", etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ika=" + ika +
                '}';
    }
    public void jarjesta() {
        Collections.sort(lista);
    }


}
