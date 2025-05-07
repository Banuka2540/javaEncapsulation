import java.util.ArrayList;
import java.util.Scanner;

class nStudent{
    private String name ;
    private int age;
    private float grade;

    public void setDetails(String n, int a,float g) {
        name = n;
        age = a;
        grade = g;
    }

    public void DisplayDetails(){
        System.out.println("Student name : " + name);
        System.out.println("Student age : " + age);
        System.out.println("Student grade : " + grade);
        System.out.println("------------------------");

    }


}

public class StudentManagement {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<nStudent> studentList = new ArrayList<>();

        System.out.print("How many Students : ");
        int count = input.nextInt();
        input.nextLine();

        for(int i=0;i<count;i++) {
            System.out.print("enter " + (i+1) + "th student name : ");
            String name = input.nextLine();


            System.out.print("enter " + (i+1) +" th Student age : ");
            int age = input.nextInt();


            System.out.print("enter "+ (i+1) +" th Student Grade : ");
            float grade = input.nextFloat();
            input.nextLine();

            System.out.println("-----------------------------------------");

            nStudent student = new nStudent();
            student.setDetails(name,age,grade);
            studentList.add(student);
        }

        for(nStudent student : studentList){
            student.DisplayDetails();
        }

        input.close();
    }
}

