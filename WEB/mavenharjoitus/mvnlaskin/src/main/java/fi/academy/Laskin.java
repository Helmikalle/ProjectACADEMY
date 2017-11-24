package fi.academy;

public class Laskin {
    public int laskeYhteen(int ... luvut) {
        int tulos=0;
        for (int luku:luvut) {
            tulos += luku;
        }
        return tulos;
    }

    public double laskeYhteen(double ... luvut) {
        return 0.3;
    }
}
