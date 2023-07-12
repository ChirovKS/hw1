
public class StepTracker {

    class MonthData {
        int[] dayArray;

        MonthData() {
            dayArray = new int[30];
        }
    }

    int stepTarget = 10000;
    MonthData[] monthArray; //инициализация должна быть доступной для всех элементов документа.
    Converter converter;



    public StepTracker() {
        monthArray=new MonthData[12]; //строгий вопрос наполнения сущности.
        converter= new Converter();
        for (int i = 0; i < monthArray.length; i++) { // в каждую ячейку массива я поместил сам объект
            monthArray[i] = new MonthData();
        }
    }

    public void addStepsByDay(int month, int day, int steps) {
        monthArray[month].dayArray[day] = steps;
    }

    public void changeTarget(int newTarget) {
        stepTarget = newTarget;
    }

    public void statistic(int monthStat) {

        // вывод числа шагов по дням

        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            if (i < monthArray[monthStat].dayArray.length - 1) {
                System.out.print(i + 1 + " день: " + monthArray[monthStat].dayArray[i] + ", ");
            } else {
                System.out.println(i + 1 + " день: " + monthArray[monthStat].dayArray[i]);
            }
        }

        // вывод суммы шагов за месяц
        int stepSum = 0;
        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            stepSum = stepSum + monthArray[monthStat].dayArray[i];
        }
        System.out.println("Всего за этот месяц пройдено " + stepSum + " шагов.");

        // поиск максимального количества шагов в месяце
        int maxSteps = 0;
        for (int i = 0; i < monthArray.length; i++) {
            if (maxSteps< monthArray[monthStat].dayArray[i]){
                maxSteps=monthArray[monthStat].dayArray[i];
            }
        }
        System.out.println("Самое большое число шагов в день — " + maxSteps + ".");

        //вывод среднего количества шагов в месяце.
        int averageSteps = stepSum/monthArray[monthStat].dayArray.length;
        System.out.println("Среднее число шагов в день = " + averageSteps);

        //вывод пройденной дистанции в колометрах
        System.out.println("Пройдено " + converter.convertToKm(stepSum)+ "километров");

        //вывод сожжёных каллорий
        System.out.println("Сожжено "+ converter.convertStepsToKilocalories(stepSum)+ "килокалорий");

        //Расчёт и вывод лучшей серии

        int counterSeries = 0; //Счётчик серии дней
        int bestSeries= 0; //переменная для хранения длины лучшей серии дней.
        for(int i =0; i< monthArray[monthStat].dayArray.length; i++){
            if(monthArray[monthStat].dayArray[i]>stepTarget){
                counterSeries++;
                if(bestSeries<counterSeries){
                    bestSeries=counterSeries;
                }
            }else{
                counterSeries=0;
            }
        }
        System.out.println("Ваше упорство заслуживает уважения! Вы целых "+bestSeries+" дней превышали свою цель по числу шагов в день.");
    }

}
