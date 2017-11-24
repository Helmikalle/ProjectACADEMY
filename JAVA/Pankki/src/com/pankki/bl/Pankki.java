package com.pankki.bl;

public class Pankki {
    private Tili[] tilit;

    public Pankki(Tili[] t) {
        tilit = t;
    }

    public void talleta(int tilinro, double summa) {
        tilit[tilinro].pano(summa);
    }

    public boolean nosta(int tilinro, double summa) {
        return tilit[tilinro].otto(summa);
    }

    public boolean siirra(int mista, int mihin, double summa) {
        if (tilit[mista].otto(summa)) {
            tilit[mihin].pano(summa);
            return true;
        } else {
            return false;
        }
    }
}
