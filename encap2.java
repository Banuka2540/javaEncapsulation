import java.util.Scanner;
class AGE {
    private int n;

    public void setAge(int num ){
        if (num>0 & num<=30){
            System.out.println("age is under 30 ! ");            
        }else if(num>30 & num<100){
            System.out.println("age is over 30 ");
        }else{
            System.out.println("Invalid age ! Check again ");
        }

        this.n = num;
    }

    public int getAge(){
        return n;
    }
    
}

public class encap2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Age : ");
        int userAge = input.nextInt();
        

        AGE age = new AGE();
        age.setAge(userAge); 

        System.out.println("Your age is " + age.getAge());
        input.close();
    }
}
