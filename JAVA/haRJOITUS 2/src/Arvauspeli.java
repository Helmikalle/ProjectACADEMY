import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("arvaa luku 1-100: ");
        int hyvaksytty = 0;
        int hylatty = 0;
        //int summa = 0;
        int arvaus = (int) (1 + Math.random() * 100);

        while (true) {
            int luku = Integer.parseInt(lukija.next());


            if (luku == arvaus){
                hyvaksytty++;
                break;
            } else if (luku >= 1 && luku <= 100) {
                hyvaksytty++;
                if (luku < arvaus) {
                    hylatty++;
                    System.out.println("lukuni on suurempi!");
                }
                if (luku > arvaus){
                    hylatty++;
                    System.out.println("lukuni on pienempi!");

                }
                if (hylatty == 10) {
                    break;
                }

            } else {
                System.out.println("wroong");
            }


        } if(hylatty==10){
            System.out.println("oops liian monta arvasusta!");
        }else
            System.out.println("Oikein! arvasit : " + hyvaksytty + " kertaa!");
        {

        }
    }
}

//string suunta = vastaus < salainen ? "pieni" : "suuri";
//sout  ("blabla " + suunta);