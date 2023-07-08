import java.util.Scanner;

public class MonthData {

    int[] days = new int[30];

    StepTracker stepTracker;


    void printDaysAndStepsFromMonth(int month) {
        System.out.println("За какой месяц нужна статистика?");

        for (int i = 0; i < stepTracker.monthData.length; i++) {
            if (stepTracker.monthData[i] == stepTracker.monthData[month]) {
                for (int j = 0; j < stepTracker.monthData[month].days.length; i++) {
                    System.out.println("День " + (j + 1) + ": " + stepTracker.monthData[month].days[j]);
                }
            }
        }
    }

    void printSumStepsFromMonth(int month) {
        int sum = 0;
        for (int i = 0; i < stepTracker.monthData.length; i++) {
            if (stepTracker.monthData[i] == stepTracker.monthData[month]) {
                for (int j = 0; j < stepTracker.monthData[month].days.length; j++) {
                    sum += stepTracker.monthData[month].days[j];
                }
            }
        }

        System.out.println("Общее количество шагов за месяц:" + sum);
    }

    void findMaxStepsFromMonth(int month) {
        int maxSteps = 0;
        for (int i = 0; i < stepTracker.monthData.length; i++) {
            if (stepTracker.monthData[i] == stepTracker.monthData[month]) {
                for (int j = 0; j < stepTracker.monthData[month].days.length; j++) {
                    if (maxSteps < stepTracker.monthData[month].days[j]) {
                        maxSteps = stepTracker.monthData[month].days[j];
                    }

                }
            }
        }
    }

    void findBestSeries(int month) {
        int Series = 0;
        int currentSeries = 0;

        for (int i = 0; i < stepTracker.monthData[month].days.length; i++) {
            if (stepTracker.monthData[month].days[i] >= stepTracker.goalByStepsPerDay) {
                if(stepTracker.monthData[month].days[i]>= stepTracker.goalByStepsPerDay &&
                        stepTracker.monthData[month].days[i-1]>= stepTracker.goalByStepsPerDay){
                    currentSeries++;
                }
            }
        }
        System.out.println("Лучшая серия выполнения цели шаков в день за " + stepTracker.monthData[month] + " " + currentSeries);
    }
}