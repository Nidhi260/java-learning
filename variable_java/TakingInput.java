import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        sc.nextLine();
        System.out.println("The lucky number is: " + a);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("The name is: " + name);


        sc.close();


    }

}
