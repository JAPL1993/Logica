public class App {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (Boolean.TRUE.equals(isPrimo(i)))
                System.out.println(Integer.toString(i));
        }
    }

    static Boolean isPrimo(Integer number) {
        if (number <= 1)
            return false;
        for (Integer i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
