import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud3.add(s6);

        
        StudentGroup group1 = new StudentGroup(listStud);
        StudentGroup group2 = new StudentGroup(listStud2);
        StudentGroup group3 = new StudentGroup(listStud3);
        // System.out.println(group4580);

        // for (Student std : group4580) {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for (Student std : group4580.getGroup()) {
        //     System.out.println(std);
       // }
        List<StudentGroup> groups = new ArrayList<StudentGroup>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

        

       
        
        StudentSteam flow = new StudentSteam(groups, 1);

        System.out.println("|=========================================================|");

        for (StudentGroup stdi : flow) {
            System.out.println(stdi);
            for (Student stud : stdi) {
                System.out.println(stud);
            }
        }
        
       
        System.out.println("||=========================================================||");
      
        flow.print(flow);
        Collections.sort(flow.getListGroup());
        System.out.println("===---===---===---Sorting---===---===---===---===");
        flow.print(flow);
        System.out.println(flow);
    }
}