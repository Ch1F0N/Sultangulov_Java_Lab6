import task1.DemoClass;
import task1.InvokeProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Меню заданий:\n" +
                        "1. @Invoke\n" +
                        "2. @Default\n" +
                        "3. @ToString\n" +
                        "4. @Validate\n" +
                        "5. @Two\n" +
                        "6. @Cache\n" +
                        "7. Тестирование (1)\n" +
                        "8. Тестирование (2)\n" +
                        "0. Выход\n");

                System.out.print("Выберите задание из меню, которое хотите запустить: ");
                int task_menu = scanner.nextInt();
                System.out.println();

                if (task_menu == 0) {
                    break;
                }

                switch (task_menu) {
                    case 1:
                        // @Invoke
                        System.out.println("Демонстрация работы аннотации @Invoke.");

                        System.out.println("Создаём объект DemoClass...");
                        DemoClass demo = new DemoClass();

                        System.out.println("\nВы хотите вызвать только методы с аннотацией @Invoke? (yes/no): ");
                        scanner.nextLine();
                        String input = scanner.nextLine().trim().toLowerCase();

                        if (input.equals("yes")) {
                            System.out.println("\nАвтоматический вызов методов с @Invoke:");
                            InvokeProcessor.process(demo);
                        } else {
                            System.out.println("\nРучной вызов обычного метода:");
                            demo.regularMethod();
                        }

                        System.out.println("\nРабота программы завершена.");
                        System.out.println();
                        break;
                    case 2:
                        // @Default

                        System.out.println();
                        break;
                    case 3:
                        // @ToString

                        System.out.println();
                        break;
                    case 4:
                        // @Validate

                        System.out.println();
                        break;
                    case 5:
                        // @Two

                        System.out.println();
                        break;
                    case 6:
                        // @Cache

                        System.out.println();
                        break;
                    case 7:
                        // Тестирование (1)

                        System.out.println();
                        break;
                    case 8:
                        // Тестирование (2)

                        System.out.println();
                        break;
                }
            } catch(InputMismatchException e){
                System.out.println("Вы должны ввести только целое число!");
                System.out.println();
            }
        }
    }
}