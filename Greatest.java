//3. Write a program to find greatest of three numbers using nested
// if-else.

public class Greatest {
    public static void main(String[] args) {
        int a = 40, b = 60, c = 20;

        if (a > b) {
            if (a > c)
                System.out.println("Greatest = " + a);
            else
                System.out.println("Greatest = " + c);
        } else {
            if (b > c)
                System.out.println("Greatest = " + b);
            else
                System.out.println("Greatest = " + c);
        }
    }
}



