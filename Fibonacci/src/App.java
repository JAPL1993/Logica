import java.util.logging.Logger;

public class App {
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        long oldVal = 0;
        long newVal = 1;
        for (int i = 0; i <= 49; i++) {
            System.out.println(Long.toString(oldVal));
            long fib = oldVal + newVal;
            oldVal = newVal;
            newVal = fib;
        }

    }
}
