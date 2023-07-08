import java.util.Scanner;
public class StepTracker {
    MonthData[] monthData = new MonthData[12]; //создал массив с классом объектов. Исходя из ранее созданного класса
    //MonthData, а не просто похуй какой!
    Scanner scanner= new Scanner(System.in);
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;



        for (int i=0; i<monthData.length; i++){ // в каждую ячейку массива я поместил сам объект
            monthData[i]= new MonthData();
        }

    }
    void addNewNumberStepsPerDay(){
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        System.out.println("Введите номер дня");

        int day= scanner.nextInt();

        System.out.println("Введите количество шагов");
        int steps= scanner.nextInt();

        MonthData data = monthData[month]; //я получил во вновь созданный объект ссылку на место в массиве
        data.days[day]= steps; // судя по всему внутри объекта monthData существует массив days который
        //существует в нём через связанный с темой файл MonthData
    }
    void changeStepGoal(int newGoal){
        goalByStepsPerDay = newGoal;
    }
}
