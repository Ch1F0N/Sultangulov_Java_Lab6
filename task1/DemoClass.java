package task1;

/**
 * Демонстрационный класс с различными методами.
 */
public class DemoClass {

    /**
     * Метод, отмеченный аннотацией Invoke.
     * Будет вызван автоматически.
     */
    @Invoke
    public void methodToInvoke() {
        System.out.println("Метод methodToInvoke() был автоматически вызван!");
    }

    /**
     * Обычный метод, не будет вызван автоматически.
     */
    public void regularMethod() {
        System.out.println("Обычный метод вызван вручную.");
    }

    /**
     * Второй метод с аннотацией Invoke.
     */
    @Invoke
    public void anotherInvokedMethod() {
        System.out.println("Метод anotherInvokedMethod() тоже вызван автоматически!");
    }
}
