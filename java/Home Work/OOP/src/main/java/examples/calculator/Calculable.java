package examples.calculator;

public interface Calculable {
    Calculable sum(int arg);

    Calculable multi(int arg);

    Calculable devision(int arg);

    Calculable minus(int arg);

    int getResult();
}
