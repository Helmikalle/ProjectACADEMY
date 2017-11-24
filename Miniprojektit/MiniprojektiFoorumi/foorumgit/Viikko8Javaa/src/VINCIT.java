import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.Locale;

public class VINCIT {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String text = "\uD83D\uDD61\uD83C\uDFB3\uD83D\uDCA9\uD83C\uDFE0\uD83C\uDF17\uD83D\uDC96\uD83C\uDF4C\uD83D\uDC96\uD83C\uDF17\uD83D\uDC96\uD83D\uDD56\uD83C\uDF1C\uD83D\uDC96\uD83C\uDFB3\uD83D\uDD61\uD83D\uDC8F\uD83D\uDC96\uD83C\uDFB3\uD83C\uDF0B\uD83D\uDCA9";
        String text1 = text.toUpperCase(Locale.getDefault());
        System.out.println(text1);
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toChars(128353));
        sb.append(Character.toChars(127923));
        System.out.println(sb);
        String s = "口水雞 hello Ä";

        String s1 = Normalizer.normalize(text, Normalizer.Form.NFKD);
        String regex = "[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+";

        String s2 = new String(s1.replaceAll(regex, "").getBytes("ascii"), "ascii");

        System.out.println(s2);
        System.out.println(s.length() == s2.length());

    }
}
