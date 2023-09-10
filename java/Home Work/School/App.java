import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountControllers;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        // Создание студентов
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        // Созданием списки,в которые будут распределяться студенты
        List<Student> listStud = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud3.add(s6);
        // Преобразуем списки в студенческие группы
        StudentGroup group1 = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);

        // System.out.println("=========================================================");
        // Группы записываем в одну,чтобы передать все три группы в один поток
        List<StudentGroup> groups = new ArrayList<StudentGroup>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        StudentSteam flow = new StudentSteam(groups, 1);
        // for (StudentGroup stdi : flow) {
        // System.out.println(stdi);
        // for (Student stud : stdi) {
        // System.out.println(stud);
        // }
        // }
        System.out.println("||=========================================================||");

        flow.print(flow);
        Collections.sort(flow.getListGroup());
        System.out.println("===---===---===---Sorting---===---===---===---===");
        flow.print(flow);
        System.out.println();
        System.out.println(flow);
        System.out.println("======-----======-----======-----Sorting-----======-----======-----======-----======");
        Teacher t1 = new Teacher("Марина", 60, "Магистр");
        Teacher t2 = new Teacher("Дарья", 32, "Балаклавр");
        Teacher t3 = new Teacher("Иосиф", 65, "Магистр");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(t3);
        teachers.add(t2);
        teachers.add(t1);
        System.out.print("Учителей,");
        AccountControllers.averageAge(teachers);
        System.out.print("Студентов " + listStud2 + ",");
        AccountControllers.averageAge(listStud2);

    }
}