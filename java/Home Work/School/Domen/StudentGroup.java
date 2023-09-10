package Domen;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    /**
     * Констурктор для минимального ввода данных,при котором idGroup будет
     * задаваться рандомным числом
     * 
     * @param group   - Лист студентов
     * @param idGroup - Номер группы задающийся рандомным числом
     */
    public StudentGroup(List<Student> group) {
        this(group, 999);
    }

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = GetRandom();
    }

    int GetRandom() {
        int min = 1000;
        int diff = 9999 - min;
        Random random = new Random();
        int xz = random.nextInt(diff + min) + min;
        return xz;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public int getLength() {
        return group.size();
    }

    public Student getStudent(int idStudent) {
        return group.get(idStudent);
    }

    @Override
    public String toString() {
        return "Группа{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';

    }

    // @Override
    // public Iterator<Student> iterator() {
    // return new Iterator<Student>() {

    // private int counter;

    // @Override
    // public boolean hasNext() {

    // if(counter<group.size())
    // {
    // return true;
    // }
    // else
    // {
    // return false;
    // }
    // }

    // @Override
    // public Student next() {
    // return group.get(counter++);
    // }

    // };

    // }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    @Override
    public int compareTo(StudentGroup s) {
        if (this.group.size() == s.group.size()) {
            return 0;
        } else if (this.group.size() < s.group.size()) {
            return -1;
        } else {
            return 1;
        }
    }

}