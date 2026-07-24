//5. Accept the price from user. Ask the user if he is a student (user //may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% //otherwise
//discount is 10%.But if he is not a student then if he has purchased //more than 600
//discount is 15% otherwise there is not discount.

public class Discount {
    public static void main(String[] args) {
        double price = 700;
        char student = 'y';
        double discount = 0;

        if (student == 'y' || student == 'Y') {
            if (price > 500)
                discount = price * 0.20;
            else
                discount = price * 0.10;
        } else {
            if (price > 600)
                discount = price * 0.15;
            else
                discount = 0;
        }

        System.out.println("Discount = " + discount);
        System.out.println("Final Price = " + (price - discount));
    }
}

