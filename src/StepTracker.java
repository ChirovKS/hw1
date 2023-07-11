

public class StepTracker {

    MonthData[] monthArray; //создал массив с классом объектов. Исходя из ранее созданного класса
    int goalByStepsPerDay = 10000;

    public StepTracker() {

        monthArray = new MonthData[12];

        for (int i = 0; i < monthArray.length; i++) { // в каждую ячейку массива я поместил сам объект
            monthArray[i] = new MonthData();
        }
    }

    class MonthData { //поместил класс внутри класса.
        int[] dayArray;

        MonthData() {
            dayArray = new int[30];
        }
        //int[] days = new int[30];
    }

    void addNewNumberStepsPerDay(int month, int day, int steps) {

        monthArray[month].dayArray[day] = steps;
        System.out.println("Вы записали " + monthArray[month].dayArray[day]);
    }

    public void changeStepGoal(int newGoal) {
        goalByStepsPerDay = newGoal;
    }

    public void statistik(int month) {
        for (int i = 0; i < monthArray[month].dayArray.length; i++) {
            System.out.println("День " + (i + 1) + ":" + " " + monthArray[month].dayArray[i]);
        }

        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {

            if (monthArray[i] == monthArray[month]) {
                for (int j = 0; j < monthArray[month].dayArray.length; j++) {
                    sum += monthArray[month].dayArray[j];
                }
                System.out.println("Общее количество шагов за месяц:" + sum);
            }
        }

        int maxSteps = 0;
        for (int i = 0; i < monthArray.length; i++) {
            if (monthArray[i] == monthArray[month]) {
                for (int j = 0; j < monthArray[month].dayArray.length; j++) {
                    if (maxSteps < monthArray[month].dayArray[j]) {
                        maxSteps = monthArray[month].dayArray[j];
                    }

                }
            }
        }

        int Series = 0;
        int currentSeries = 0;


        for (int i = 0; i < monthArray[month].dayArray.length; i++) {
            if (monthArray[month].dayArray[i] >= goalByStepsPerDay) {
                if (monthArray[month].dayArray[i] >= goalByStepsPerDay &&
                        monthArray[month].dayArray[i] >= goalByStepsPerDay) {
                    currentSeries++;
                } else {
                    currentSeries = 0;
                }
            }
        }
        System.out.println("Лучшая серия выполнения цели шаков в день за " + month + " " + currentSeries);
    }
}