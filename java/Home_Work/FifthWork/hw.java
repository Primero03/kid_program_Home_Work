package Seminar.fifth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// import java.util.TreeMap;


public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        Map<String, ArrayList> book = new HashMap<>();

        System.out.println("---* Это телефонный справочник * ---");
        boolean flag = true;

        while (flag) {
            System.out.println("----------------------------");
            System.out.println("Выберите нужный пункт меню: ");
            System.out.println(" 1 - добавить контакт.\n 2 - просмотреть весь список.\n 3 - выход.\n");
            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    System.out.print("Введите фамилию: ");
                    String name = sc.next();
                    if (book.containsKey(name)) {
                        ArrayList<Integer> numbUsOld = new ArrayList<>(book.get(name));
                        System.out.print("Номер телефона: ");
                        Integer numb = sc.nextInt();
                        numbUsOld.add(numb);
                        book.put(name, numbUsOld);
                    } else {
                        System.out.print("Номер телефона: ");
                        Integer numbNew = sc.nextInt();
                        ArrayList<Integer> userN = new ArrayList<>();
                        userN.add(numbNew);
                        book.put(name, userN);
                    }
                    break;
                case "2":
                    System.out.println(book);

                    for (int i = 5; i > 0; i--) {
                        for (Map.Entry<String, ArrayList> item : book.entrySet()) {
                            if (item.getValue().size() == i) {
                                System.out.println(item.getKey() + " : " + item.getValue());
                            }
                        }
                    }

                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Сделайте правильный выбор ((( ");
                    break;
            }
        }
    }
}
