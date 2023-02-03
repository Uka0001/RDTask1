package t5LogickOperators;
/*
Створити 3 програми:

програму для знаходження більшого з двох чисел

програму для знаходження меншого з двох чисел

програму для перевірка заданого числа на парність
* */
public class LogickOperatorsTask {
    public static void main(String[] args) {
        System.out.println(getMax(34, 64));
        System.out.println(getMin(455, 48));
        System.out.println(isOdd(5));
    }

    private static boolean isOdd(int i) {
        System.out.println("Парне число: " + i);
        return i % 2 == 0;
    }

    private static int getMin(int first, int second) {
        System.out.println("програму для знаходження більшого з двох чисел: ");
        return first > second ? first : second;
    }

    private static int getMax(int first, int second) {
        System.out.println("програму для знаходження меншого з двох чисел: ");
        return first < second ? first : second;
    }
}
