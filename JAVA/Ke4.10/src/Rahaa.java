import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;




public class Rahaa {
    public static void main(String[] args) throws ParseException {
        DateFormat df = DateFormat.getDateInstance(
                DateFormat.MEDIUM, Locale.UK);
        Locale fi = new Locale("fi","FI");
        Locale US = new Locale("us","US");
        double piinegatiivinen = -3.14;
        System.out.println(NumberFormat.getCurrencyInstance(fi).format(piinegatiivinen));
        System.out.println(NumberFormat.getCurrencyInstance(US).format(piinegatiivinen));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(piinegatiivinen));
        Date d = df.parse("24-Dec-2014");
        System.out.println(df.format(d));
    }
}
