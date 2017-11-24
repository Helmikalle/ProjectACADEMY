package fi.academy.loc;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LocHenkilo {
    String etunimi;
    String sukunimi;
    Date syntymapaiva;
    double palkka;

   //public  LocHenkilo(String kalle, String helminen, Date time, int i){
     //  this("Kalle","Helminen",new GregorianCalendar(1988, Calendar.MARCH,10).getTime(),2000);
   //}

    public LocHenkilo() {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.syntymapaiva = syntymapaiva;
        this.palkka = palkka;
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



    public double getPalkka() {
        return palkka;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }



    }
