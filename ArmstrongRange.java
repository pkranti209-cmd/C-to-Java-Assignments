//1. Print armstrong numbers in the given range 1 to n.

public class ArmstrongRange {
    public static void main(String[] args) {
        int n = 500;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;
            }

            if (sum == i)
                System.out.println(i);
        }
    }
}

