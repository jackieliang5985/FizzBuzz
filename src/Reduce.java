public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int counter = 0;
        while(i != 0){
            boolean even = i % 2 == 0;
            if (even) {
                i = i/ 2;
            }
            else {

                i = i-1;

            }
            counter++;

        }
        System.out.println(counter);
    }
}
