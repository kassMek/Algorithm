package java8Exercises.mapVsFlatMap;

import java8Exercises.Employee;
import java8Exercises.Student;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main (String[] args) {
        List<Customer> list=DataBase.getAll();

        List<String> emails=list.stream()
                                 .map(x->x.getEmail())
                                  .collect(Collectors.toList());
        //System.out.println(emails);

        List<List<String>> phoneNumbers=list.stream()
                                             .map(x->x.getPhoneNumbers())
                                             .collect(Collectors.toList());
       // System.out.println(phoneNumbers);

        //using flatmap
        List<String> phoneUsingFlatMap=list.stream()
                                           .flatMap(x->x.getPhoneNumbers().stream())
                                           .collect(Collectors.toList());

        //System.out.println("phone using flat map:"+phoneUsingFlatMap);

        List<Student> studentList = new ArrayList<Student>();

        //Adding Students
        studentList.add(new Student(11,"John",22));
        studentList.add(new Student(22,"Steve",18));
        studentList.add(new Student(33,"Lucy",22));
        studentList.add(new Student(44,"Samantha",23));
        studentList.add(new Student(55,"Maggie",18));
        studentList.add(new Student(19,"John",22));
        studentList.add(new Student(24,"Lucy",22));


        //student with max age
        Student  stud=studentList.stream()
                               .max(Comparator.comparing(Student::getAge))
                                .get();

        System.out.println("student with max age:"+stud);

        //student with minimum age
        Student withMinAge=studentList.stream()
                                       .min(Comparator.comparing(Student::getAge))
                                       .get();
        System.out.println("student with min age:"+withMinAge);


        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> empList = Arrays.asList(employees);

    //Minimum salary

        Double minSalary=empList.stream()
                                  .mapToDouble(Employee::getSalary)
                                   .min().orElseThrow(NoSuchElementException::new);
        System.out.println("minimum salary is:"+minSalary);

        DoubleSummaryStatistics dd=empList.stream()
                                          .mapToDouble(Employee::getSalary)
                                          .summaryStatistics();
        System.out.println("min salary using summary statistics:"+dd.getMin());
        // getting the number of counts by each department
        Map<String, Long> counting=empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(counting);

    }
}
