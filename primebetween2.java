import java.util.Scanner;

class PrimeBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        if (lower > upper) {
            System.out.println("Invalid input: lower bound should be less than or equal to upper bound.");
        } else {
            System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
            boolean foundPrime = false;
            for (int num = lower; num <= upper; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    foundPrime = true;
                }
            }
            if (!foundPrime) {
                System.out.println("No prime numbers found in the given range.");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}