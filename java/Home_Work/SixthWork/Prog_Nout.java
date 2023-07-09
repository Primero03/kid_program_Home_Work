package kid_program_Home_Work.java.Home_Work.SixthWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Prog_Nout {
  
  public static void main(String[] args) {

    Nout note1 = new Nout();
    Nout note2 = new Nout("", 6, 512, "Dos", "Grey");
    Nout note3 = new Nout("", 8, 1024, "Linux");
    Nout note4 = new Nout("", 10, "Mac");
    Nout note5 = new Nout("", 12, 1024, "Win", "White");
    Nout note6 = new Nout("", 12, 1024, "Win");
    
    ArrayList <Nout> vitrina = new ArrayList<>();
    vitrina.add(note1);
    vitrina.add(note2);
    vitrina.add(note3);
    vitrina.add(note4);
    vitrina.add(note5);
    vitrina.add(note6);   
    System.out.println("---*** Каталог ноутбуков *** ---"); 
    System.out.println(vitrina);    

    Scanner sc = new Scanner(System.in, "cp866");

    Map<String, Object> filters = new HashMap<>(); 
    boolean flag = true;
    while(flag){
      System.out.println("----------------------------");
      System.out.println("Выберите нужный пункт меню: ");
      System.out.println(" 1 - RAM\n 2 - HDD\n 3 - OS\n 4 - Color\n 5 - exit\n");
      String menu = sc.nextLine();
         
      HashSet<Nout> result = new HashSet<>();

      switch(menu){
        case "1":
          System.out.print("Введите минимальную ОЗУ: ");
          Integer temp1 = sc.nextInt();
          sc.nextLine();
          filters.put("RAM", temp1);
          System.out.println(filters);          

          for (Map.Entry<String, Object> item : filters.entrySet()) {
            if (item.getKey().equals("RAM")) {
              Iterator<Nout> iv = vitrina.iterator();
              while (iv.hasNext()) {
                Nout nt = (Nout) iv.next();
                if (nt.getRAM() >= (Integer) item.getValue()) {
                  result.add(nt);
                }
              }
            }
          }  
          break;

        case "2":
          System.out.print("Введите минимальный объем HDD: ");
          Integer temp2 = sc.nextInt();
          sc.nextLine();
          filters.put("HDD", temp2);
          System.out.println(filters);          

          for (Map.Entry<String, Object> item : filters.entrySet()) {
            if (item.getKey().equals("HDD")) {
              Iterator<Nout> iv = vitrina.iterator();
              while (iv.hasNext()) {
                Nout nt = (Nout) iv.next();
                if (nt.getHDD() >= (Integer) item.getValue()) {
                  result.add(nt);
                }
              }
            }
          }
          break;

        case "3":   
        System.out.print("Введите желаемую ОС (Dos, Linux, Mac, Win): ");
          filters.put("OS", sc.nextLine());
          System.out.println(filters);          

          for (Map.Entry<String, Object> item : filters.entrySet()) {
            if (item.getKey().equals("OS")) {
              Iterator<Nout> iv = vitrina.iterator();
              while (iv.hasNext()) {
                Nout nt = (Nout) iv.next();
                if (nt.getOS().equals(item.getValue())) {
                  result.add(nt);
                }
              }
            }
          }
          break;

        case "4":          
          System.out.print("Введите желаемый цвет (Black, White, Grey): ");
          filters.put("Color", sc.nextLine());
          System.out.println(filters);          

          for (Map.Entry<String, Object> item : filters.entrySet()) {
            if (item.getKey().equals("Color")) {
              Iterator<Nout> iv = vitrina.iterator();
              while (iv.hasNext()) {
                Nout nt = (Nout) iv.next();
                if (nt.getColor().equals(item.getValue())) {
                  result.add(nt);
                }
              }
            }
          }
          break;

        case "5":
          flag = false;
          break;

        default:
          System.out.println("Сделайте правильный выбор ((( ");          
          break;
      }
      System.out.println("По вашему запросу, следующий выбор: \n" + result);
    }
    sc.close();
  }  
}
