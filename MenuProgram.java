//5. Write a menu driven program to take a number for user and //perform operations as follows.

//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.



public class MenuProgram {
    public static void main(String[] args) {

        int choice = 2;   // Change this value (1 to 6)
        int num = 121;

        switch (choice) {

            case 1:
                if (num % 2 == 0)
                    System.out.println("Even Number");
                else
                    System.out.println("Odd Number");
                break;

            case 2:
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0)
                        count++;
                }

                if (count == 2)
                    System.out.println("Prime Number");
                else
                    System.out.println("Not Prime Number");
                break;

            case 3:
                int temp = num;
                int rev = 0;

                while (temp != 0) {
                    int rem = temp % 10;
                    rev = rev * 10 + rem;
                    temp = temp / 10;
                }

                if (rev == num)
                    System.out.println("Palindrome Number");
                else
                    System.out.println("Not Palindrome Number");
                break;

            case 4:
                if (num > 0)
                    System.out.println("Positive Number");
                else if (num < 0)
                    System.out.println("Negative Number");
                else
                    System.out.println("Zero");
                break;

            case 5:
                temp = num;
                rev = 0;

                while (temp != 0) {
                    int rem = temp % 10;
                    rev = rev * 10 + rem;
                    temp = temp / 10;
                }

                System.out.println("Reverse = " + rev);
                break;

            case 6:
                temp = num;
                int sum = 0;

                while (temp != 0) {
                    sum += temp % 10;
                    temp /= 10;
                }

                System.out.println("Sum of Digits = " + sum);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}


