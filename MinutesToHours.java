//7. Write a C program to convert given minutes into hours and remaining //minutes.

public class MinutesToHours {
    public static void main(String[] args) {
        int minutes = 130;
        int hours = minutes / 60;
        int rem = minutes % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Remaining Minutes = " + rem);
    }
}

