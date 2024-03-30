public class Main {
    public static void main(String[] args) {
       // wrapper classes = is a way to use primitve datatypes as reference sata types that may usefult methods can be used in collections

        // primitve = boolean,char,int,double
        // referance = Boolean,Char,Int,Double

        //autoboxing = assigning primitve values to the corresomding wrapper class automatically
        //aoutoboxing= reversereference data types to the primitive value

        // autoboxing
        Boolean a = true;
        //Character b = "@";
        Integer c = 123;
        Double d = 3.26;
        String e = "Vikash";

        //unboxing feature even if this is referance datype it will still behave as primitve
        if(c == 123 ){
            System.out.println("this is true");
        }

    }
}