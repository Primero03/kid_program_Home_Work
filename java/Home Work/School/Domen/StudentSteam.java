package Domen;

import java.util.Iterator;
import java.util.List;


public class StudentSteam implements Iterable<StudentGroup> {
    
    private List<StudentGroup> listGroup;
    private Integer idSteam;

    public StudentSteam(List<StudentGroup> listGroup, Integer idSteam) {
        this.listGroup = listGroup;
        this.idSteam = idSteam;
    }

   
    @Override
    public String toString() {
        return "Номер потока:" + idSteam + "Кол-во групп:" + listGroup.size() + listGroup;
    }
    public List<StudentGroup> getListGroup(){
        return listGroup;
    }

    public void print(StudentSteam steam){
        for(StudentGroup group : steam.getListGroup()){
            System.out.println();
            System.out.println("Группа номер:" + group.getIdGroup()+ " Кол-во студентов в гурппе:" + group.getLength());
            for(int i=0;i<group.getLength();i++){
                System.out.println(group.getStudent(i));
            }
        }
    }
   

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(listGroup);
    }
}
