import java.util.Scanner;

class IfElseandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        System.out.println("Enter your third number:");
        int c = sc.nextInt();

        System.out.println("The maximum of the three numbers is: " + MaxofThree(a, b, c));
        System.out.println("The nearest number to first number is: " + NearestToNumber(a, b, c));
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        sc.close();
    }

    static int MaxofThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int NearestToNumber(int a, int b, int c) {
        int diffB = Math.abs(a - b);
        int diffC = Math.abs(a - c);
        if (diffB < diffC) {
            return b;
        } else {
            return c;
        }
    }

    static int maxDiffConsecutive(int[] arr) {
        int maxDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
        
}