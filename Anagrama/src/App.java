import java.util.Arrays;
import java.util.logging.Logger;

public class App {
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Verificando");
        System.out.println(isAnagrama("amor", "amor"));
    }

    public static Boolean isAnagrama(String wordOne, String wordTwo) {
        if (wordOne.equalsIgnoreCase(wordTwo))
            return false;
        char[] wordOneChars = wordOne.toLowerCase().toCharArray();
        char[] wordTwoChars = wordTwo.toLowerCase().toCharArray();
        Arrays.sort(wordOneChars);
        Arrays.sort(wordTwoChars);
        return Arrays.equals(wordOneChars, wordTwoChars);
    }
}
