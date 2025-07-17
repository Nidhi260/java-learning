import java.util.Scanner;
public class Divisible_by_3_or_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if((n % 3 == 0) || (n % 5 == 0)){
            System.out.println("Number is found: " + n);
        }
        sc.close();
    }

}
