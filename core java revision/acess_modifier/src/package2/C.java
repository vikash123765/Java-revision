package package2;
import package1.*;

public class C {

    public String publicmessage =" this is a public message";
    protected String protectedcmessage =" this is a protected message";
    String defaultMessage = "this is the default";
    private String privatecmessage =" this is a private message";


}




// public method is visible from diffent packages

// protected is only visble to a subclass of the prant class you create the instance f the sublclass then you can acees whatever in the parent class

// default is only visible to same package

