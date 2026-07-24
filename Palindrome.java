//9 Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome

public class Palindrome {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;

        while(temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if(rev == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

