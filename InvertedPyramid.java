//5. Print an inverted pyramid pattern
//Input: n = 5
//Output:

//*****
//****
//***
//**

public class InvertedPyramid {
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

