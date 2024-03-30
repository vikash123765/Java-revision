import java.lang.annotation.*;

@Target(ElementType.METHOD) // if you try to pass method in class you will get error that why mrthod

@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation
{

    int value();
}
