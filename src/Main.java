//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    static StepTracker stepTracker;
    public static void main(String[] args) {
        stepTracker=new StepTracker();
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();


        while (command != 0) {
            if (command == 1) {
                readMonthDaySteps(scanner); // этот метод собирает данные и передаёт данные в метод записывающий данные в массив
            } else if (command == 2) {
                printStat(scanner);//
            } else if (command == 3) {
                readNewTarget(scanner); // записываем новую цель по шагам
            } else if (command == 0) {
                System.out.println("Выход из программы");
            }

            printMenu();
            command = scanner.nextInt();
        }
        System.out.println("Работа завершена");
    }

    static void printMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("Для ввода данных - 1");
        System.out.println("Статистика за месяц - 2");
        System.out.println("Изменить цель - 3");
        System.out.println("Выход из программы - 0");
    }

    static void readMonthDaySteps(Scanner scanner) {
        System.out.println("Введите порядковый номер месяца");
        int month = scanner.nextInt() - 1;
        System.out.println("Введите порядковый номер дня");
        int day = scanner.nextInt() - 1;
        System.out.println("Введите количество шагов");
        int steps= scanner.nextInt();

        stepTracker.addStepsByDay(month, day, steps);
    }

    static void readNewTarget(Scanner scanner){
        System.out.println("Введите новую цель по шагам");
        int newTarget= scanner.nextInt();
        stepTracker.changeTarget(newTarget);
    }

    public static void printStat(Scanner scanner){
        System.out.println("За какой месяц вы хотите увидеть статистику?");
        int monthStat= scanner.nextInt()-1;
        stepTracker.statistic(monthStat);
    }

}
