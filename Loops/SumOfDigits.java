import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original_n = n;

        while(n >0){
            sum += n % 10;
            n /= 10;  
        }
        System.out.println("Sum of digits of: " + original_n + " = " + sum);
        sc.close();
    }

}
