//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command = 100;

        while (command != 0) {
            StepTracker stepTracker = new StepTracker();

            printMenu();
            command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Какова ваша цель по количеству шагов в сутки?");
                int goalSteps = scanner.nextInt();
                stepTracker.changeStepGoal(goalSteps);
            } else if (command == 2) {
                System.out.println("Введите номер месяца");
                int month = scanner.nextInt() -1;
                System.out.println("Введите номер дня");
                int day = scanner.nextInt()-1;
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();


                stepTracker.addNewNumberStepsPerDay(month, day, steps);

            } else if (command == 3) {
                System.out.println("За какой месяц вы хотите получить статистику?");
                int month = scanner.nextInt()-1;
                stepTracker.statistik(month);


            } else if (command == 0) {
                System.out.println("Выход");
                System.out.println(" ");
            } else {
                System.out.println("Ты чё Вася, охренел нажимать на неправильные кнопки?!!! Хуесос");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }

    static void printMenu() {
        System.out.println("Привет друг. Если ты решил следить за своей шаговой нагрузкой - ты зашёл куда надо!");
        System.out.println("Контекстное меню управляется целыми числами. Имей это виду плиз! Bro");
        System.out.println("Для записи новой цели по количеству шагов в сутках набирай 1 и жми Ентер");
        System.out.println("Если надо записать сколько ты прошёл шагов в конкретный день жми 2");
        System.out.println("Показать статистику сделанных шагов за месяц жми   3");
        System.out.println("Если хочешь выйти из программы жми 0");
    }
}
