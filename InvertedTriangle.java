//3. Print an inverted right-angled triangle pattern
//Input: n = 5
//Output:

//*****
//****
//***
//**
//*

public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

