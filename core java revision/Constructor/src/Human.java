public class Human {

    String name;
    int age;
    double height;


    void Human(String name,int age,double height){
        this.name= name;
        this.age=age;
        this.height=height;
    }
    void fast (){
        System.out.println(this.name+" runs faster then the other person");
    }
    void slow (){
        System.out.println(this.name+"runs slower then the other person");
    }

}
