import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задание №1; выводить не не надо по условиям задачи.
        int[] numbers = new int[]{1, 2, 3};
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] cars = new int[]{16, 530, 83, 42, 85, 139};
        System.out.println();
        System.out.println("Задание №2");
        task2();
        System.out.println();
        System.out.println();
        System.out.println("Задание №3");
        task3();
        System.out.println();
        System.out.println();
        System.out.println("Задание №4");
        task4();
    }

    public static void task2() {
        int[] numbers = new int[]{1, 2, 3};
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] cars = new int[]{16, 530, 83, 42, 85, 139};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i2 = 0; i2 < numbers2.length; i2++) {
            System.out.print(numbers2[i2]);
            if (i2 != numbers2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i3 = 0; i3 < cars.length; i3++) {
            System.out.print(cars[i3]);
            if (i3 != cars.length-1) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {
        int[] numbers = new int[]{1, 2, 3};
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] cars = new int[]{16, 530, 83, 42, 85, 139};
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i2 = numbers2.length-1; i2 >= 0; i2--) {
            System.out.print(numbers2[i2]);
            if (i2 != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i3 = cars.length-1; i3 >= 0; i3--) {
            System.out.print(cars[i3]);
            if (i3 != 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        int[] numbers = new int[] {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}






