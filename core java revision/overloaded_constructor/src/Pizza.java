public class Pizza {

    String cheese;
    String bread;

    String topping;

    String sauce;

    Pizza(String cheese, String bread,String topping,String sauce ){

        this.cheese = cheese;
        this.bread = bread;
        this.topping= topping;
        this.sauce=sauce;

    }

    Pizza(String cheese, String bread,String topping ){

        this.cheese = cheese;
        this.bread = bread;
        this.topping= topping;


    }

    Pizza(String cheese, String bread){

        this.cheese = cheese;
        this.bread = bread;


    }

    Pizza(String cheese ){

        this.cheese = cheese;


    }

}
