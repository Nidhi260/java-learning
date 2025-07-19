package Loops;
import java.util.Scanner;
public class StreamOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;

        while(num != -1){
            sum +=num;
            num = sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }

}
