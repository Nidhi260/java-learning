import java.util.Scanner;

public class Student_marks {
   public Student_marks() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the marks of student ");
      float var2 = var1.nextFloat();
      float var3 = var1.nextFloat();
      float var4 = var1.nextFloat();
      float var5 = var1.nextFloat();
      float var6 = var1.nextFloat();
      float var7 = (var2 + var3 + var4 + var5 + var6) / 5.0F ;
      System.out.println("Total percentage of the student is : " + var7);
      var1.close();
   }
}

