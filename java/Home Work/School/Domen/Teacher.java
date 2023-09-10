package Domen;

public class Teacher extends Person {
    private String acadDegree;

    /**
     * Констуктор класса учителя
     * 
     * @param name       - Имя учителя
     * @param age        - Возраст
     * @param acadDegree - Академическая степень
     */
    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }
}