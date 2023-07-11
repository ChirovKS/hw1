//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    static StepTracker stepTracker;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command = 100;


        while (command != 0) {


            printMenu();
            command = scanner.nextInt();

            if (command == 1) {
                readMonthDaySteps(scanner);
            } else if (command == 2) {

            } else if (command == 3) {



            } else if (command == 0) {

            } else {

            }
        }
    }

    static void printMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("Для ввода данных - 1");
        System.out.println("Статистика за месяц - 2");
        System.out.println("Изменить цель - 3");
    }

    static void readMonthDaySteps(Scanner scanner) {
        System.out.println("Введите порядковый номер месяца");
        int month = scanner.nextInt() - 1;
        System.out.println("Введите порядковый номер дня");
        int day = scanner.nextInt() - 1;
        System.out.println("Введите количество шагов");
        int steps= scanner.nextInt();

        stepTracker.addNewNumberStepsPerDay(month, day, steps);
    }

}
