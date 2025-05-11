/*public class myclass {
    public static void main(String[] args){
        int a = 10 , b = 20 , c = 30 ;
        if (a>b){
            if (a>c){
                System.out.println("a is larger ");
            }else{
                System.out.println("c is larger ");
            }
        }else if(b>c){
            System.out.println("b is larger ");
        }else{
            System.out.println("c is larger ");
        }
    }

}*/
/*public class myclass {
    public static void main(String[] args) {
        int a =10 , b=20 , c=30 , max;
        if(a>b){
            if (a>c){
                max = a;
            }else{
                max = c;
            }
        }else if(b>c){
            max = b;
        }else{
            max = c;
        }

        System.out.print("the largest num is : " + max);
    }

}*/

/*import java.util.Scanner;

public class myclass{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter Your Name : ");
        String name = input.nextLine();

        System.out.print("enter Your Age : ");
        int age = input.nextInt();

        System.out.println("your name is : " + name);
        System.out.println("your age is : " + age);
    }
}*/

/*import java.util.Scanner;
public class myclass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = input.nextInt();

        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("it is divisable by 5 and 3 ");
        }else{
            System.out.println("not divisible ");
        }
    }
}*/
/*import java.util.Scanner;
public class myclass{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter a Number : ");
        int num = input.nextInt();

        boolean isPrime =true;

        if (num <=1){
            isPrime = false ;
        }else{
            for(i=2;i<=num;i++){
               if (num % i == 0){
                   isPrime =
               }
            }
        }

        input.close();
    }
}*/


public class myclass {
    public static void main(String[] args) {
        //exersise 1

        /*System.out.println("hello");
        System.out.println("Yuthila");}*/

        //exercise 2
        /*int a=10 , b=20 ,sum =a+b;
        System.out.println("add 2 numbers " + a + " and "+ b);
        System.out.println("the result is : " + sum );*/

        //exercise 3
        int a = 10  , b = 20  ,temp ;

        /*System.out.println("first number : " + a);
        System.out.println("second number : " + b);
        System.out.println("---------------------");
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println("swapped number 1  : " + a);
        System.out.println("swapped number 2  : " + b);*/
    }
}