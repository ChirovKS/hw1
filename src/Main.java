//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        printMenu();
    }

    static void printMenu() {
        int command = 100;

        while(command != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Привет друг. Если ты решил следить за своей шаговой нагрузкой - ты зашёл куда надо!");
            System.out.println("Контекстное меню управляется целыми числами. Имей это виду плиз! Bro");
            System.out.println("Для записи новой цели по количеству шагов в сутках набирай 1 и жми Ентер");
            System.out.println("Если надо записать сколько ты прошёл шагов в конкретный день жми 2");
            System.out.println("Показать статистику сделанных шагов за месяц жми   3");
            System.out.println("Если хочешь выйти из программы жми 0");
            command = scanner.nextInt();
            int numberOfStepsToday;
            if (command == 1) {
                System.out.println("Какова ваша цель по количеству шагов в сутки?");
                numberOfStepsToday = scanner.nextInt();
            } else if (command == 2) {
                System.out.println("Записываемое количество шагов, bro");
                System.out.println(" ");
                numberOfStepsToday = scanner.nextInt();
                System.out.println("В какой месяц записываем результат?");
                System.out.println(" ");
                int recordMonth = scanner.nextInt();
                System.out.println("В какой день месяца записываем результат?");
                System.out.println(" ");
                int var4 = scanner.nextInt();
            } else if (command != 3) {
                if (command == 0) {
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

    }
}
