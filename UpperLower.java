//6. Write a program to check whether a given character is uppercase or //lowercase.
public class UpperLower {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else
            System.out.println("Invalid Character");
    }
}

