package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Student;

public class EmployeeServices implements iPersonServices<Employee> {
    private int count;
    private List<Employee> employees;

    public EmployeeServices() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age,"barista");
        count++;
        employees.add(emp);
    }

    public void sortByFIO(){
        PersonComparator<Employee> pesComp = new PersonComparator<>();
        employees.sort(pesComp);
    }
}
