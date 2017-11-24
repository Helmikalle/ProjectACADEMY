package testtest;

public class Koira extends Object {
    private final String rotu;
    private String nimi;
    private int ika;

    public Koira(String rotu){
        this.rotu = rotu;
        this.nimi = "Poju";
    }

    public Koira(int i) {
        this("mäyräkoira");
        setIka(ika);
    }

    public void kuseksii() {

    }

    public String getRotu() {
        return rotu;
    }


    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        if(ika < 0)
            return;
        this.ika = ika;
    }

    @Override
    public String toString() {
        return "Koira{" +
                "rotu='" + rotu + '\'' +
                ", nimi='" + nimi + '\'' +
                ", ika=" + ika +
                '}';
    }
}
