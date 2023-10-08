package IsCorrect;
import java.util.regex.Pattern;
public class isCorrect{

    public static boolean check(String arg) {
        String re = "[А-я]*\\s[А-я]*\\s[А-я]*\\s\\d{2}\\.\\d{2}\\.\\d{4}\\s\\d{4}\\sг\\.\\s[А-я]*$";
        return Pattern.matches(re, arg);

    }
}