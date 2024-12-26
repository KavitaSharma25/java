import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input and print the first 2D array
        System.out.println("Enter the first 2D array size:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr2D = new int[row][col];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The 2D array is:");
        print2DArray(arr2D);
        
        // Input and print the second 2D array
        System.out.println("Enter the second 2D array size:");
        int row1 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr2D2 = new int[row1][col2];
        
        System.out.println("Enter the elements of the second 2D array:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                arr2D2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The second 2D array is:");
        print2DArray(arr2D2);
        
        // Find and print the maximum value in the second 2D array
        maxofarr2(arr2D2);
        
        sc.close();
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] arr2D) {
        for (int[] row : arr2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to find and print the maximum value in a 2D array
    public static void maxofarr2(int[][] arr2D2) {
        int max2 = arr2D2[0][0];
        for (int[] row : arr2D2) {
            for (int element : row) {
                if (element > max2) {
                    max2 = element;
                }
            }
        }
        System.out.println("The maximum value in the second 2D array is: " + max2);
    }
    
}
