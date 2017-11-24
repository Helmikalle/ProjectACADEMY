import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;
import java.util.Locale;

public class PvnTulostaja {

    public static void tulostaKielillä() throws ParseException {

        LocalDateTime p = LocalDateTime.now();
        Locale kielialue = new Locale("fi", "FI");
        DateFormat muotoilija =
                DateFormat.getDateInstance(DateFormat.MEDIUM, kielialue);
        Date d = new Date();
        DateFormat muotoilija2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter df2 = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(df2.format(p));
        System.out.println(df1.format(p));
        System.out.println(df.format(p));
        System.out.println(muotoilija.format(d));
        System.out.println(muotoilija2.format(d));



    }

}
