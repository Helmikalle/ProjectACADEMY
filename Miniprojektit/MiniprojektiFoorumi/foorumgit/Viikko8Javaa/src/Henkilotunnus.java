import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Henkilotunnus {
    boolean tarkista(String tunnus){
        Locale alue = new Locale("fi","FI");
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy MM dd");

        try {
            LocalDate parsedDate = LocalDate.parse(tunnus, formatter);
            String paiva = parsedDate.toString();
            if (tunnus.equals(paiva)){
                return true;
            }else{
                return false;
            }
        } catch (DateTimeParseException e) {
            return false;
        }


    }

}
