/*class _Student {
    int age ;
    String name;

    _Student(String n , int a ){
        name = n ;
        age = a ;
    }

    void GetData(){
        System.out.println("your name is : " + name + "\n your age is : " + age);
    }
}
*/



/*public class classes_objects {
    public static void main (String[] args) {
        //initialize object variables using reference method
        /*Student s1 = new Student() ;
        s1.name = "yuthila";
        s1.age = 15 ;
        System.out.println("your name is : " +s1.name + "  and your age is : " + s1.age);
        */

        //initalize through methods inside class
        /*_Student s1 = new _Student();
        s1.SetData("yuthila",18);
        s1.GetData();*/

        //initialize through constructors
        /*_Student s1 = new _Student("yuthila",18);
        s1.GetData();


    }

}*/


//exercise regarding static and this
/*class car {
    String make , model ;
    int year ;

    //constructors using this keyword
    public car (String make , String model , int year ){
        this.make = make ;
        this.model = model ;
        this.year = year ;
    }
    //method to display details
    public void DisplayData(){
        System.out.println("the make , model and year is : " + make + model + year  );
    }
}

public class classes_objects{
    public static void main(String[] args){
        car c1 = new car("ford","f",2019);

        c1.DisplayData();


    }
}

*/

class product {
    String productName;
    int productCode;
    int price;

    //constructor 1
    public product(String productName, int productCode) {
        this.productName = productName ;
        this.productCode = productCode;
    }
    //constructor 2
    public product(String productName, int productCode,int price) {
        this(productName,productCode);
        this.price = price ;
    }
    public void displaydata(){
        System.out.println("product name : " + productName);
        System.out.println("product code : " + productCode);
        System.out.println("product price : " + price);
    }

}
public class classes_objects {
    public static void main(String[] args) {
        product p1 = new product("x",1531,445);
        product p2 = new product("y",131,44);

        p1.displaydata();
        p2.displaydata();
    }
}