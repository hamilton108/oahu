package oahu.testing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestUtil {
    @SuppressWarnings("unchecked")
    public static <T,T2> T2 callMethodFor(Class<T> type, T object, String methodName, Class[] paramTypes, Object[] params) {
        try {
            Method method = type.getDeclaredMethod(methodName,paramTypes);
            method.setAccessible(true);
            return (T2)method.invoke(object, params);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        //return type.cast(friends.get(name));
    }
}
