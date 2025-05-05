
public class Basics{
    public static void main(String[] args){
        System.out.println("hhello world ! ");
        int age = 4;
        int x =  4 , y = 2 ;
        double weight = 45.78 ;
        String name = "yuthila";

        if (age > 5){
            System.out.println("age is greater than 5 ");
        }else if(age == 5 ){
            System.out.println("age is 5 ");
        }else{
            System.out.println("Age is lower than 5 ");
        }
        System.out.println(age);
        System.out.println(weight);
        System.out.println(name);
        System.out.println(x + y);

        //loops 

        for(int i=0;i<=5;i++){
            System.out.println("*");
        }
        int i =2;
        while(i<=5){
            System.err.println("hi");
            i++;
        }
    }
}