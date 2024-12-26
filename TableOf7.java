import java.util.Scanner;
class tableof7 {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.print("Enter a number to print its table: ");
       int n= scanner.nextInt();
    for (int i=1; i<=10; i++){
        System.out.println(n+" * "+i+" = "+n*i);
    }
    }
}