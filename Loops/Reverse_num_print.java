package Loops;
import java.util.Scanner;
public class Reverse_num_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        for(int num = n; num>=1; num--){
            System.out.println(num);
        }
        sc.close();
    }

}
