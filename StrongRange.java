//4. Print strong numbers in the given range 1 to n.

public class StrongRange {
    public static void main(String[] args) {
        int n = 1000;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                int rem = temp % 10;
                int fact = 1;

                for (int j = 1; j <= rem; j++) {
                    fact *= j;
                }

                sum += fact;
                temp /= 10;
            }

            if (sum == i)
                System.out.println(i);
        }
    }
}

