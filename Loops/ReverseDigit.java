import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           
        int reverseNum = 0;
        while(n>0){
          reverseNum = (reverseNum *10) + n%10;
          n /= 10;
        }
        System.out.println(reverseNum);
        sc.close();
    }

}
