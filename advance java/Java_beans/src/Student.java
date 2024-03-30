import java.io.Serializable;

public class Student  implements Serializable {



  private static final long serialVersionUID=1L;
    private String name;
    private int age;
    private String adress;

    Student(){};
  /*  Student (String name,int age,String adress){
        this.name=name;
        this.age=age;
        this.adress=adress;
    }*/

    public void SetName(String name){
        this.name=name;
    }
    public void SetAge(int age){
        this.age=age;
    }
    public void SetAdress(String adress){
        this.adress=adress;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }
}
