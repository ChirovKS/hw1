public class Converter {
    static double stepRate= 0.75/1000;
    static double calRate= 50.0/1000;

    double convertToKm(int steps){
        return steps * stepRate;
    }
    double convertStepsToKilocalories(int steps){
        return steps*calRate;
    }

}
