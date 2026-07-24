//6. Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" //or "Divisible by
//both" or” Divisible by None”)

public class Divisible {
    public static void main(String[] args) {
        int num = 15;

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisible by both");
        else if (num % 3 == 0)
            System.out.println("Divisible by 3 but not by 5");
        else if (num % 5 == 0)
            System.out.println("Divisible by 5 but not by 3");
        else
            System.out.println("Divisible by None");
    }
}

