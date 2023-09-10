package Services;

import java.util.List;

import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonServices<Teacher> {
    private int count;
    private List<Teacher> teachers;

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "Магистр");
        count++;
        teachers.add(teach);

    }

    public void sortByFIO(List<Teacher> teachers) {
        PersonComparator<Teacher> pesComp = new PersonComparator<>();
        teachers.sort(pesComp);
    }

}
