// value = 2
// sum = 0
// while value <= 10:
//     sum = sum + value
//     value = value + 2
// end while
// Print sum


public class solutaion9 {
    public static void main(String[] args) {
        int value = 2;
        int sum = 0;

        while (value <= 10) {
            sum = sum + value;
            value = value + 2;
        }

        System.out.println(sum);
    }
}
