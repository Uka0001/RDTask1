package t7Methods;

public class MetodsTask {
    public static void main(String[] args) {
        System.out.println(getCube(2));
        printStar(5);
        printSimbol("A", 6);
    }

    private static void printSimbol(String symbol, int number) {
        System.out.println("Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод: ");
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private static void printStar(int number) {
        System.out.println("Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод: ");
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static int getCube(int i) {
        System.out.println("Створити метод який повертає куб заданого числа: ");
        return (int) Math.pow(i, 3);
    }
}
