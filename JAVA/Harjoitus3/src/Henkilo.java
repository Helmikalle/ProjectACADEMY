class Henkilo  implements Comparable<Henkilo> {
    //private List<Henkilo> lista;
    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
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
        return "Henkilo{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ika=" + ika +
                '}';
    }

    @Override
    public int compareTo(Henkilo o) {
        return this.etunimi.compareTo(o.etunimi);

    }
}
