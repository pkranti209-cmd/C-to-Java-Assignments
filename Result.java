//4. Ask the user to enter marks.
//Then show the result based on these rules:
//If marks are more than 65 → show "First Class"
//If marks are more than 65 → show "First Class"
//If marks are more than 55 → show "Second Class"
//If marks are 40 or more → show "Pass Class"
//If marks are less than 40 → show "Fail"

public class Result {
    public static void main(String[] args) {
        int marks = 72;

        if (marks > 75)
            System.out.println("Distinction");
        else if (marks > 65)
            System.out.println("First Class");
        else if (marks > 55)
            System.out.println("Second Class");
        else if (marks >= 40)
            System.out.println("Pass Class");
        else
            System.out.println("Fail");
    }
}

