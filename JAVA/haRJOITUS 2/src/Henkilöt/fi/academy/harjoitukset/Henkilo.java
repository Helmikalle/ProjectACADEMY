package Henkilöt.fi.academy.harjoitukset;


import Henkilöt.fi.academy.harjoitukset.fi.academy.LaitonIkaException;
import sun.invoke.empty.Empty;

public class Henkilo {

    private String etunimi;
    private String sukunimi;
    private int ika;
    private final int id;
    private static int seuraavaID = 1;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
        this.id = seuraavaID++;
    }
    public Henkilo(){
        this("","",0);
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        if(etunimi==null){
           throw new NullPointerException("kk");
        }
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        if(sukunimi.equals(null)) {
            throw (new NullPointerException());
        }
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) throws LaitonIkaException {
        if(ika<0 || ika>120) {
            throw (new LaitonIkaException("kk"));
        }
        this.ika = ika;
    }

    public int getId() {
        return id;
    }

    public static int getSeuraavaID() {
        return seuraavaID;
    }

    public static void setSeuraavaID(int seuraavaID) {
        Henkilo.seuraavaID = seuraavaID;
    }

    @Override
    public String toString() {
        return "Henkilo{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", ika=" + ika +
                ", id=" + id +
                '}';
    }
}
   //public boolean equals(Object o) {
      //  Henkilo apu = (Henkilo)o;
        //if(!this.etunimi.equals(apu.etunimi)){
           // return false;
           // if(!this.sukunimi.equals(apu.sukunimi))
              //  return false;
            //if(!)





