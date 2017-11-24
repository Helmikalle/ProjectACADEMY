package testtest;


public class Elaintesti {
    public static void main(String[]args){
        Koira poju = new Koira(-1);
        System.out.println(poju.getIka());
        poju.setNimi("Poju");
        System.out.println(poju.toString());
        poju.setIka (-1);

    }
}

//public boolean equals(Object o){
  //  return toString().equals(o.toString())
