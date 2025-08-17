import java.util.Scanner;
public class Num_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" "); //for spaces
            }
            for(int k=1; k<=i; k++){
                System.out.print(k); // for number 1 2  3 
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l); //for reverse number after printing number like 1 2 3 2 1
            }
            System.out.println();
        }
        sc.close();
    }

}
