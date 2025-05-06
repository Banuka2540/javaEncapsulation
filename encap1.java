class person{
    private String name;

    //setter method
    public void setName(String n ){
        name = n ;
    }
    //getter method 
    public String getName(){
        return name ;
    }

}
public class encap1{
    public static void main(String[] args){
        person xy = new person();
        xy.setName("Yuthila");
        System.out.println("my name is " + xy.getName());

    }
}