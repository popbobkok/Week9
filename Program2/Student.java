package Program2;

import java.util.Scanner;

public class Student {
    private String Fname = "Hello";
    private String Lname = "World";

    public String toString() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Write First name : ");
        Fname = myObj.nextLine();
        System.out.print("Write Last name : ");
        Lname = myObj.nextLine();
        return "My first name : " + Fname + " // last name : " + Lname;
    }

    public static void main(String[] args) {
        Student p = new Student();
        System.out.println(p.toString());
    }
}
