//5 Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong


public class Armstrong {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;

        while(temp != 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}

