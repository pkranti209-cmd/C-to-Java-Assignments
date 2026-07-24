//2 Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50

public class Table {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}