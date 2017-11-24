package fi.academy;

public class Nimi {
    public String greet (){
        return "Hello, Bob!";

    }


    public String greet(String name) {
        if (name.equals("")||name == null)
            name = "my friend";
        return "Hello, " + name + "!";

    }
}
