package calc;

import java.util.*;

public class Calculation {
    int a, b, c;
    Scanner sc = new Scanner(System.in);

    public int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        b = sc.nextInt();
        return c;
    }

    int choice = sc.nextInt();

    int calc() {
        switch (choice) {
            case 1:
                Addition addition = new Addition();
                int c = addition.add(a, b);
                System.out.println(c);
                break;
            case 2:
                Substraction substraction = new Substraction();
                c = substraction.sub(a, b);
                System.out.println(c);
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                c = multiplication.mul(a, b);
                System.out.println(c);
                break;
            case 4:
                Division division = new Division();
                c = division.div(a, b);
                System.out.println(c);

                break;

        }

return c;
    }
}