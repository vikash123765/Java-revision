public class Main {
    public static void main(String[] args) {

        //statement that allows a variable to be te be tested again a list of values
        String day= "pizza";
        switch(day){
            case"Monday" : System.out.println( "its monday");
            break;
            case"thusday" : System.out.println( "its thusday");
                break;
            case"wednesday" : System.out.println( "its wednesday");
                break;
            case"thursday" : System.out.println( "its thurday");
                break;
            case"friday" : System.out.println( "its friday");
                break;
            case"saturday" : System.out.println( "its saturday");
                break;
            case"sunday" : System.out.println( "its sunday");
                break;
            default:
                System.out.println("that is not a day");

        }
    }
}