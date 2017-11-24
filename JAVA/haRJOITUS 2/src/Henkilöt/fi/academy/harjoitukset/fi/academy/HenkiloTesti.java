package Henkilöt.fi.academy.harjoitukset.fi.academy;

import Henkilöt.fi.academy.harjoitukset.Henkilo;

public class HenkiloTesti {

    public static void main(String[]args) throws Exception {
        Henkilo henkilo = new Henkilo();{
            System.out.println(henkilo);
            henkilo.setEtunimi("Outi");
            henkilo.setSukunimi("Helminen");
            henkilo.setIka(0);
            System.out.println(henkilo);

            Henkilo[]hlot = {

                    new Henkilo("John", "Doe", -1),
                    new Henkilo("Jane", "Doe", 28),
                    new Henkilo("John", "Doe", 55),
                    new Henkilo("John", "Deere", 21),
                    new Henkilo("James", "Gosling", 55)



            };
            for(Henkilo h: hlot) {
                System.out.println(h);
            }
            Henkilo john = new Henkilo("John", "Doe", 21);
            System.out.println(hlot[0] == john); // false
            System.out.println(hlot[0].equals(john)); // true


        }
    }
}

