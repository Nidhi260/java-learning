package Loops;
import java.util.Scanner;
public class Sum_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
// print 1 to n 
            int sum = 0;
          int nums = 1;
        // while(nums <= n){
        //     System.out.println(nums);
        //     nums ++;

        // }
        //sum of n  natural numbers
        while(nums <=n){
            sum += nums;
            nums++;
        }
        System.out.println(sum);
        sc.close();

    }

}
