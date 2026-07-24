//7. Calculating total salary based on basic. If basic <=5000 da, ta and //hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% //and 30%
//respectively.

public class Salary {
    public static void main(String[] args) {
        double basic = 6000;
        double da, ta, hra, total;

        if (basic <= 5000) {
            da = basic * 0.10;
            ta = basic * 0.20;
            hra = basic * 0.25;
        } else {
            da = basic * 0.15;
            ta = basic * 0.25;
            hra = basic * 0.30;
        }

        total = basic + da + ta + hra;

        System.out.println("Basic Salary = " + basic);
        System.out.println("DA = " + da);
        System.out.println("TA = " + ta);
        System.out.println("HRA = " + hra);
        System.out.println("Total Salary = " + total);
    }
}


  

