import java.util.logging.Logger;

public class App {
    static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Boolean fizz = i % 3 == 0;
            Boolean buzz = i % 5 == 0;
            if (fizz && buzz)
                logger.info("FizzBuz");
            else if (Boolean.TRUE.equals(fizz))
                logger.info("Fizz");
            else if (Boolean.TRUE.equals(buzz))
                logger.info("Buzz");
        }
    }
}
