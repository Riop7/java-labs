package lab4.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Chordata chordata = new Chordata();
        for (Method m : chordata.getClass().getDeclaredMethods()) {
           if (m.isAnnotationPresent(PrivateMethod.class)) {
               try {
                   m.setAccessible(true);
                   PrivateMethod pm = m.getAnnotation(PrivateMethod.class);
                   int countOfInvoke = pm.countOfInvokes();
                   while (countOfInvoke > 0)
                   {
                       m.invoke(chordata);
                       countOfInvoke--;
                   }
                   System.out.println();
               } catch (IllegalAccessException | InvocationTargetException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
