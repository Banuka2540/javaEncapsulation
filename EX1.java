import java.util.Scanner;

public class EX1{
    //create a function that takes user name and display text
    static void add(String name){
        System.out.println("Hello My name is " + name);
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = input.nextLine();
        add(name);
        
        input.close();
    }
}