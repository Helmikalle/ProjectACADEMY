package fi.academy.testaus;


public class Luokka {
    private String sana;

    public Luokka() {
        this.sana = null;
    }


    public String getIsoSana() {
        if (sana == null) {
            throw new AlustamatonLuokkaException();
        }
        return sana.toUpperCase();
    }

    public String getSana() {
        return sana;
    }

    public String setSana(String sana) {
        this.sana = sana;
        return sana;
    }


}
