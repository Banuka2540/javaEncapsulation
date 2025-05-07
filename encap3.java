class Student {
    private String name;
    private int age;


    public void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    public void getDetails() {
        System.out.println("Student name :  " + name + "  Student age : " + age);
    }

}



public class encap3{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Banuka",21);
        s1.getDetails();
    }
}
