public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }
    public static int multiples() {
        int i = 0;
        for (int num = 1; num < 1000; num++) {
            boolean divisibleBy3 = num % 3 == 0;
            boolean divisibleBy5 = num % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                i++;
            }
        }
        return i;
    }
}