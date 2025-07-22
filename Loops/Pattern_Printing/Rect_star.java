package Loops.Pattern_Printing;
import java.util.Scanner;
public class Rect_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : " );
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j =1; j<=c; j++){
                //condition for hollow rect
                if((i==1 || i ==r) || (j==1 || j==c)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                //System.out.print("*");
            }
            System.out.println();
        }
      sc.close();  
    }

}
