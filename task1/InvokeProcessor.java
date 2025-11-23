package task1;

import java.lang.reflect.Method;

/**
 * Класс, который сканирует методы объекта и вызывает те,
 * которые помечены аннотацией @Invoke.
 */
public class InvokeProcessor {

    /**
     * Ищет методы, помеченные @Invoke, и вызывает их автоматически.
     *
     * @param obj объект, методы которого нужно исследовать
     */
    public static void process(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Ошибка при вызове метода: " + e.getMessage());
                }
            }
        }
    }
}
