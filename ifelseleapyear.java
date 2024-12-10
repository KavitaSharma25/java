import java.util.Scanner;

class IfElseDemo {
    public static void main(String[] args) {
        int x = 15;
        int y = 12;
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x is equal to y");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isleap = leap(year);
        System.out.println("Is " + year + " a leap year? " + isleap);
    }

    public static boolean leap(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        if (year % 100 != 0 && year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}