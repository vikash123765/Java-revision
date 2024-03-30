import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L; // whenever u do an ubject it does an increment of one, keeping count of fobject updates for security resons

    private String name ;
    private int age;
    private String address;

    transient int x; // will not be serialized

    public Student(String name,int age, String address){
        this.name = name;
        this.age=age;
        this.address=address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }

    public String toString(){
        return("Student name is :" + this.getName()+" adress is :"+this.getAddress());
    }
}



