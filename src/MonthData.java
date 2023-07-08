import java.util.Scanner;
public class MonthData {
    Scanner scanner= new Scanner(System.in);
    StepTracker stepTracker= new StepTracker(scanner);
    int [] days= new int[30];

    void printDaysAndStepsFromMonth(int month){
        System.out.println("За какой месяц нужна статистика?");

        for(int i = 0; i<stepTracker.monthData.length; i++){
            if(stepTracker.monthData[i] == stepTracker.monthData[month]){
                for (int j = 0; j<stepTracker.monthData[month].days.length; i++){
                    System.out.println("День " + (j+1)+": "+ stepTracker.monthData[month].days[j]);
                }
            }
        }
    }
    void printSumStepsFromMonth(int month){
        int sum=0;
        for(int i=0; i<stepTracker.monthData.length; i++){
            if(stepTracker.monthData[i] == stepTracker.monthData[month]){
                for (int j= 0; j<stepTracker.monthData[month].days.length; j++){
                    sum+=stepTracker.monthData[month].days[j];
                }
            }
        }

        System.out.println("Общее количество шагов за месяц:" + sum);
    }

    void findMaxStepsFromMonth(int month){
        int maxSteps=0;
        for(int i=0; i<stepTracker.monthData.length; i++){
            if(stepTracker.monthData[i] == stepTracker.monthData[month]){
                for (int j= 0; j<stepTracker.monthData[month].days.length; j++){
                    if(maxSteps < stepTracker.monthData[month].days[j]){
                        maxSteps=stepTracker.monthData[month].days[j];
                    }

                }
            }
        }
    }
    void findBestSeries(int month){
        int bestSeries = 0;

        for(int i=0; i<stepTracker.monthData[month].days.length; i++){
            if (stepTracker.monthData[month].days[i] >= stepTracker.goalByStepsPerDay){
                bestSeries++;
            }
        }
        System.out.println("Лучшая серия выполнения цели шагов в день за "+ stepTracker.monthData[month] +" "+ bestSeries);
    }
}