package Strings;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        sc.close();

        //concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //length of tonystark
        System.out.println(fullName.length());

        //chatAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Not equal");
        }

        //substring
        String s = "TonyStark";
        String name_1 = s.substring(4);

        System.out.println(name_1);

        //Strings are immutable
        




    }

}
