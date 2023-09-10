package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;;

public class StudentServices implements iPersonServices<Student> {
    private int count;
    private List<Student> students;

    public StudentServices() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
       return students;
    }

    @Override
    public void create(String name, int age) {
       Student st = new Student(name, age);
       count++;
       students.add(st);
    }

    public void sortByFIO(){
        PersonComparator<Student> pesComp = new PersonComparator<>();
        students.sort(pesComp);
    }

}
