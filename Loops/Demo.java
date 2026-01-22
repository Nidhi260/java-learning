import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int  choice;
    // //     for(int i=0; i<n; i++){
    //         System.out.println(i);
    //     }
    //     int i = 0;
    //     while( i <=n){
    //         i++;
    //         System.out.println(i);

    //     }
    //     do{
    //         System.out.println(i);
    //         i++;
    //     }while(i<=n);
    //     System.out.println(i);
        
    do{
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter the student marks: ");
            double marks = sc.nextDouble();
             if(marks>=90){
               System.out.println("This is good.");
            }else if(marks>=60 && marks<=89){
                   System.out.println("This is also good.");
            }else if(marks>=0 && marks<=59){
                 System.out.println("This is good as well.");
            }else{
                 System.out.println("Invalid marks.");
    }
        }else if(choice == 0){
            System.out.println("Exiting the program.");
        }else{
            System.out.println("Invalid choice.");
        }
    }while(choice!=0);


       sc.close();
     }
    
    

}
