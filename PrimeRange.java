//2. Print prime numbers in the given range 1 to n.

public class PrimeRange {
    public static void main(String[] args) {
        int n = 50;

        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.println(i);
        }
    }
}

