import java.util.Scanner;

public class StepTracker {
    MonthData[] monthData = new MonthData[12]; //создал массив с классом объектов. Исходя из ранее созданного класса
    //MonthData, а не просто похуй какой!
    Scanner scanner;
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;
        for (int i = 0; i < monthData.length; i++) { // в каждую ячейку массива я поместил сам объект
            monthData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        System.out.println("Введите номер дня");

        int day = scanner.nextInt();

        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();

        monthData[month].days[day]=steps;

        //MonthData data = monthData[month]; //я получил во вновь созданный объект ссылку на место в массиве
        //data.days[day] = steps; // судя по всему внутри объекта monthData существует массив days который
        //существует в нём через связанный с темой файл MonthData
        System.out.println("Вы записали " + monthData[month].days[day]);
    }

    void changeStepGoal(int newGoal) {
        goalByStepsPerDay = newGoal;
    }

    void printDaysAndStepsFromMonth(int month) {
        for (int i = 0; i < monthData[month].days.length; i++) {
            System.out.println("День "+ (i+1)+":"+ " "+ monthData[month].days[i]);
        }
    }

    void printSumStepsFromMonth(int month) {
        int sum = 0;
        for (int i = 0; i < monthData.length; i++) {

            if (monthData[i] == monthData[month]) {
                for (int j = 0; j < monthData[month].days.length; j++) {
                    sum += monthData[month].days[j];
                }
                System.out.println("Общее количество шагов за месяц:" + sum);
            }
        }


    }

    void findMaxStepsFromMonth(int month) {

        int maxSteps = 0;
        for (int i = 0; i < monthData.length; i++) {
            if (monthData[i] == monthData[month]) {
                for (int j = 0; j < monthData[month].days.length; j++) {
                    if (maxSteps < monthData[month].days[j]) {
                        maxSteps = monthData[month].days[j];
                    }

                }
            }
        }
    }

    void findBestSeries(int month) {
        int Series = 0;
        int currentSeries = 0;


        for (int i = 0; i < monthData[month].days.length; i++) {
            if (monthData[month].days[i] >= goalByStepsPerDay) {
                if (monthData[month].days[i] >= goalByStepsPerDay &&
                        monthData[month].days[i] >= goalByStepsPerDay) {
                    currentSeries++;
                } else {
                    currentSeries = 0;
                }
            }
        }
        System.out.println("Лучшая серия выполнения цели шаков в день за " + month + " " + currentSeries);
    }
}
