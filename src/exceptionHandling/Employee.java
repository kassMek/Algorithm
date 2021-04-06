package exceptionHandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
   private int id;
   private  String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee emp1= new Employee(12,"Kassahun");
        Employee emp2= new Employee(45,"Efrem");
        Employee emp3= new Employee(12,"Kassahun");

        Map<Object,Integer> map= new HashMap<Object,Integer>();
        map.put(emp1,33);
        map.put(emp2,44);
        map.put(emp3,78);
        for( Object obj:map.keySet()){
            System.out.println(map.get(obj));
        }

    }
}
