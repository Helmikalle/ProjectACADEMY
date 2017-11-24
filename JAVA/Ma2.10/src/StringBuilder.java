
class StringBui {


    public static void main(String[] args) {

        String[] paivat = {"maanantai", "tiistai", "keskiviikko",
                "torstai", "perjantai", "lauantai", "sunnuntai"};
        StringBuilder paiva = new StringBuilder();


        for (int i = 0; i < paivat.length; i++) {

            paiva.append(paivat[i] + "\n");
        }

        String lista = paiva.toString();
        System.out.println(lista);


    }

}
