//takes the input from the user and then display using functions 
import java.util.Scanner;
public class EX2{
    static void adding(int n1,int n2){
        int add = n1 + n2;
        System.out.println("added number is : " + add);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        int n1 = input.nextInt();

        
        System.out.println("Enter second Number : ");
        int n2 = input.nextInt();

        adding(n1,n2);
    }

}
