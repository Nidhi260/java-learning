package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_num = n;
        while(n >0){
            n /=10;
            numOfDigits++;
        }
        System.out.println("Number of digits in " + original_num + " = " + numOfDigits);
        sc.close();
    }

}
