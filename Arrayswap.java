import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        insertionsort(array);

        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void insertionsort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            insertSorted(a, i);
        }
    }

    static void insertSorted(int a[], int n) {
        for (int i = n; i >= 1; i--) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            } else {
                break;
            }
        }
    }
}