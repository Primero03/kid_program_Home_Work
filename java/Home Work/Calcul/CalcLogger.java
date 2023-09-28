package Calcul;

public class CalcLogger implements Loggable {
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}
