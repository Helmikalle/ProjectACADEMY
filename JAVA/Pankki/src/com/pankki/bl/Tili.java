package com.pankki.bl;

public class Tili {
    private double saldo;
    private double luottoraja;

    public Tili(double saldo, double luottoraja) {
        this.saldo = saldo;
        this.luottoraja = luottoraja;
    }
    public boolean otto(double maara){
        if ((saldo -maara) >= luottoraja)
        {saldo -= maara;return true;
        } else {
            return false;
        }
    }
    public void pano(double maara){
        saldo += maara;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLuottoraja() {
        return luottoraja;
    }

    public void setLuottoraja(double luottoraja) {
        this.luottoraja = luottoraja;
    }
}
