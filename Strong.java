// 8 Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong

public class Strong {
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;

        while(temp != 0) {
            int rem = temp % 10;
            int fact = 1;

            for(int i = 1; i <= rem; i++) {
                fact *= i;
            }

            sum += fact;
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }
}

