public class MyGenericClass <Thing extends Number, Thing2> {

    Thing b;
    Thing2 c;

    MyGenericClass(Thing b,Thing2 c){
        this.b = b;
        this.c =c;

    }
    public Thing2 getValue(){
        return  c;

    }

}
