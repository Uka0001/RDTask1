package t6Loops;
/*
Створити програму для виведення чисел від 1 до 10

Показати всі парні числа в діапазоні від 1 до 100

Знайти факторіал числа 7

Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
* */
public class LoopsTask {
    public static void main(String[] args) {
        printNumbers();
        printOddNumbers();
        calculateFactorial(7);
        fibonarchiNumber(100);
    }

    private static void fibonarchiNumber(int i) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0+" "+n1+" ");
        while (n2 < i) {
                n2=n0+n1;
                if (n2 >= i){
                    break;
                }
                System.out.print(n2+" ");
                n0=n1;
                n1=n2;
        }
        System.out.println();
    }

    private static void calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.println("факторіал числа: " + n + " = " + result);
    }

    private static void printOddNumbers() {
        System.out.println("Показати всі парні числа в діапазоні від 1 до 100 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void printNumbers() {
        System.out.println("Створити програму для виведення чисел від 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
