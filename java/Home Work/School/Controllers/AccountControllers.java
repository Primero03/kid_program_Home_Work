package Controllers;

import java.util.List;
import java.util.Random;

import Domen.Person;
import Domen.Student;
import Domen.Teacher;

public class AccountControllers {
    private int zp = GetRandom();

    public <T extends Teacher> void paySalary(T person) {

        System.out.println(person.getName() + "Выплачена заработная плата в размере:" + zp);
    }

    public static <T extends Person> void averageAge(List<T> people) {
        int sum = 0;
        int count = 0;
        for (Person ex : people) {
            sum += ex.getAge();
            count++;
        }
        int average = sum / count;
        // System.out.println(sum);
        // System.out.println(count);
        System.out.println("Средний возраст состовляет:" + average);
    }

    int GetRandom() {
        int min = 9000;
        int diff = 99999 - min;
        Random random = new Random();
        int xz = random.nextInt(diff + min) + min;
        return xz;
    }
}
