package ConditionalsAndLoops;

public class DayOfWeek {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 1 || n > 7) {
            System.out.println("This number is not valid!");
        } else {
            if (n == 1)
                System.out.println("Saturday");
            else if (n == 2)
                System.out.println("Sunday");
            else if (n == 3)
                System.out.println("Monday");
            else if (n == 4)
                System.out.println("Tuesday");
            else if (n == 5)
                System.out.println("Wednsday");
            else if (n == 6)
                System.out.println("Thirsday");
            else
                System.out.println("Friday");
        }
    }
}
