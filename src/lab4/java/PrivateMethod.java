package lab4.java;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PrivateMethod{
    int countOfInvokes();
}

