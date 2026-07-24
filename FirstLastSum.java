//10 Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)


public class FirstLastSum {
    public static void main(String[] args) {
        int n = 12345;
        int last = n % 10;
        int first = n;

        while(first >= 10) {
            first = first / 10;
        }

        int sum = first + last;

        System.out.println("Sum = " + sum);
    }
}

