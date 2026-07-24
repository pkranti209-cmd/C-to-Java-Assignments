//10. Write a C program to input marks of five subjects, find the total //marks, and calculate
//the percentage.

public class Percentage {
    public static void main(String[] args) {
        int m1 = 80, m2 = 75, m3 = 90, m4 = 85, m5 = 70;
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}