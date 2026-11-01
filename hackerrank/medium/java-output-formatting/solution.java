import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double value = scan.nextDouble();
        // Write your code here.
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("String: " + name);
        System.out.println("Double: " + value);
        System.out.println("Int: " + i);
        scan.close();
    }
}
