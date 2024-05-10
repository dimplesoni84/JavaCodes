package hey;
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
       boolean test  = true;
       int result = 0;
       while (test)
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the 1st number:");
           int a = sc.nextInt();
           System.out.println("Enter the 2nd number:");
           int b = sc.nextInt();

           System.out.println("Choose an operation:");

           System.out.println("1. addition");
           System.out.println("2. substraction");
           System.out.println("3. multiplication");
           System.out.println("4. division");
           System.out.println("5. Perform operation on result: ");

           int choice = sc.nextInt();

           switch (choice) {
               case 1:
                   result = a + b;
                   break;
               case 2:
                   result = a - b;
                   break;
               case 3:
                   result = a * b;
                   break;
               case 4:

                   result = a / b;
                   break;
               case 5:
                   System.out.println("Choose an operation:");

                   System.out.println("1. addition");
                   System.out.println("2. substraction");
                   System.out.println("3. multiplication");
                   System.out.println("4. division");
                   System.out.println("5. Perform operation on result: ");

           }
           System.out.println("Result is:"+result);
       }
    }
}
