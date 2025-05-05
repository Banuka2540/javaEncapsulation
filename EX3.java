import java.util.Scanner;
public class EX3{

    static void looop(int num){
        for(int i=1;i<=num;i++){
            System.out.println("*");
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a Number for a * loop : ");
        int num = input.nextInt();

        looop(num);

    }
}