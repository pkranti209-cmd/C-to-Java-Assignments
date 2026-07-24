//7. Accept the age and check if the person is:
//Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above)

public class AgeCategory {
    public static void main(String[] args) {
        int age = 25;

        if (age < 12)
            System.out.println("Child");
        else if (age <= 19)
            System.out.println("Teenager");
        else if (age <= 59)
            System.out.println("Adult");
        else
            System.out.println("Senior");
    }
}