package FirstEvalution.Day1_Java_basics;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name here ");
        String name= scanner.nextLine();
        System.out.println("Enter your last name is ");
        String lastname=scanner.nextLine();
        // String fullname=name+" "+lastname;
        // String fullname=name.concat(lastname);
        // StringJoiner  fullname=new StringJoiner("",name," "+lastname);

      //  StringBuilder fullname=new StringBuilder();
        /*fullname.append(name);
        fullname.append(lastname);*/

        StringBuffer fullname=new StringBuffer();



       /* fullname.insert(0,name);
        fullname.insert(1,lastname);*/

       System.out.println("Full name is "+fullname);


    }
}
