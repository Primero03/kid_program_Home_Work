package kid_program_Home_Work.java.Home_Work.SixthWork;
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Класс сделать в отдельном файле
// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.ArrayList;

public class Nout {
  private String name;
  private int RAM = 4;
  private int HDD = 512;
  private String OS = "Win";
  private String color = "Black";

  private static int Index; // Индекс для нумерации
  private static ArrayList<String> names; // Коллекция имен

  static {
    Index = 1; // Начальный индекс 1
    names = new ArrayList<String>(); // Инициализируем пустую коллекцию
  }

  public Nout(String name, int RAM, int HDD, String OS, String color){
    this.name = String.format("Note_%d", Index++);
    Nout.names.add(this.name);
    this.RAM = RAM;
    this.HDD = HDD;
    this.OS = OS;
    this.color = color;
  }

  public Nout(String name, int RAM, int HDD, String OS){
    this.name = String.format("Note_%d", Index++);
    Nout.names.add(this.name);
    this.RAM = RAM;
    this.HDD = HDD;
    this.OS = OS;
    this.color = color;
  }

  public Nout(String name, int RAM, String OS){
    this.name = String.format("Note_%d", Index++);
    Nout.names.add(this.name);
    this.RAM = RAM;
    this.HDD = HDD;
    this.OS = OS;
    this.color = color;
  }

  public Nout(){
    this.name = String.format("Note_%d", Index++);
    Nout.names.add(this.name);
    this.RAM = RAM;
    this.HDD = HDD;
    this.OS = OS;
    this.color = color;
  }

  @Override
  public String toString() {    
    return String.format("\n%s, RAM: %d, HDD: %d, OS: %s, Color: %s", this.name, this.RAM, this.HDD, this.OS, this.color);
  } 

  public Integer getRAM() {
    return this.RAM;
  }

  public Integer getHDD() {
    return this.HDD;
  }

  public String getOS(){
    return this.OS;
  }

  public String getColor() {
    return color;
  }
}
