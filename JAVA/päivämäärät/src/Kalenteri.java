import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.time.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.GregorianCalendar;


public class Kalenteri {

    public static void main(String[] args) {

        GregorianCalendar gcal = new GregorianCalendar(2017, 0, 1);


        LocalDate nyt = LocalDate.of(2017, 10, 2);

        LocalDate synttarit = LocalDate.of(1988, 3, 10);
        Period vali = Period.between(synttarit, nyt);
        int paivia = vali.getDays();
        int kuukausi = vali.getMonths();
        int vuosia = vali.getYears();
        long p2 = ChronoUnit.DAYS.between(synttarit, nyt);
        //Date d = new Date();
        //LocalDateTime now = LocalDateTime.now();


        //System.out.println(gcal.getTime());
        System.out.println(nyt);
        System.out.println(synttarit);
        System.out.println(vuosia + " vuotta " + kuukausi + " kuukautta " + paivia + " päivää " +p2+"pelkkiä päiviä");
        //System.out.println(d);
        //System.out.println(now);


    }

}
