import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//making custom annotation
@Retention(RetentionPolicy.RUNTIME) // annptation will be processed at rutome
@Target(ElementType.TYPE) // where wil this annotation applied
public @interface MarkerAnnotation {



}
