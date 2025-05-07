import java.util.Scanner;

class nStudent{
    private String name ;
    private int age;

    public void setName(String n){
        this.name = n;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void DisplayName(){
        System.out.println("your name is : " + name);
    }
    public void DisplayAge(){
        System.out.println("your age is : " + age );
    }

}



public class StudentManagement {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        nStudent s1 = new nStudent();
        nStudent sn = new nStudent();

        System.out.print("enter Student name : ");
        String name = input.nextLine();
        sn.setName(name);

        System.out.print("enter Student age : ");
        int age = input.nextInt();
        s1.setAge(age);


        s1.DisplayAge();
        sn.DisplayName();
        input.close();
    }
}

