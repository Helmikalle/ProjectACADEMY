package Kalenteri;


public class Paivamaara {
        private int paiva;
        private int kuukausi;
        private int vuosi;

    public Paivamaara(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public int getPaiva() {
        return paiva;
    }

    public void setPaiva(int paiva) {
        this.paiva = paiva;
    }

    public int getKuukausi() {

        return kuukausi;
    }

    public void setKuukausi(int kuukausi) {
        if(kuukausi>12) {
            return;
        }
        this.kuukausi = kuukausi;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return "Paivamaara{" +
                "paiva=" + paiva +
                ", kuukausi=" + kuukausi +
                ", vuosi=" + vuosi +
                '}';
    }
}
