package Loops.Pattern_Printing;
import java.util.Scanner;
public class Tri_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();

        // for(int i =r; i>=1; i--){
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i =1; i<=r; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }

}
