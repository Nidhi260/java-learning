package Loops;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
        int i = 0;
        while( i <=n){
            i++;
            System.out.println(i);

        }
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        System.out.println(i);
        sc.close();
    }
    
    
}
