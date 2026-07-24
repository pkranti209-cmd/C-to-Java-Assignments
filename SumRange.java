//3 Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15

public class SumRange {
    public static void main(String[] args) {
        int start = 1, end = 5;
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

