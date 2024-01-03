package JavaHomeApp02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Slot_Machine store = new Slot_Machine();

        Toy toy1 = new Toy(1, "Конструктор Lego", 10, 20);
        Toy toy2 = new Toy(2, "Трансфомер", 200, 40);
        Toy toy3 = new Toy(3, "Мяч", 200, 90);
        Toy toy4 = new Toy(3, "Кукла Barbie", 50, 30);
        Toy toy5 = new Toy(3, "Пазл", 200, 90);
        Toy toy6 = new Toy(3, "PlayStation 5", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}