package java8Exercises;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GettingHandsDirty {

    public static void main (String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        System.out.println("printing the employee whose salary is between 4000 & 6000");

        list.stream().filter(emp->emp.getSalary()>4000 && emp.getSalary()<6000)
                .forEach(System.out::println);

        System.out.printf( "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        list.stream()
                .filter(emp->emp.getSalary()>4000 && emp.getSalary()<6000)
                //.sorted(Comparator.comparing(emp->emp.getSalary()))
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.println("Display unique employee last names sorted");
        list.stream()
                .map(emp -> emp.getLastName())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("Display only first and last names");
        list.stream()
                .map(emp->emp.getFirstName().toUpperCase()+" "+ emp.getLastName().toUpperCase())
                .forEach(System.out::println);

        //2.Print out all of the Employee objects whose last name begins with the letter  �B�  in sorted order

        list.stream()
                .filter(emp -> emp.getLastName().startsWith("B"))
                .sorted(Comparator.comparing(emp -> emp.getLastName()))
                        .forEach(System.out::println);
        System.out.println("***************");
       list.stream()
               .filter(x->x.getLastName().startsWith("B"))
               .map(x->x.getLastName().toUpperCase())
               .sorted(Comparator.reverseOrder())
               .forEach(System.out::println);

        DoubleSummaryStatistics dd=list.stream()
                                    .mapToDouble(Employee::getSalary)
                                     .summaryStatistics();
         double avr=dd.getAverage();
         double sum=dd.getSum();
        System.out.println("Average is %.2f "+avr +""+"sum is "+sum);
        System.out.println("the max salary is :"+dd.getMax());

        //finding the minimum salary of employees
         Employee ee=list.stream()
                          .min(Comparator.comparing(Employee::getSalary))
                         .orElseThrow(NoSuchElementException::new);
        System.out.println("min salary is :"+ee.getSalary());
  //finding the maximum last name
        Employee having_max_lastName=list.stream()
                                          .max(Comparator.comparing(emp->emp.getLastName()))
                                           .get();
        System.out.println("Employee with max last name:"+having_max_lastName.getLastName());
        System.out.println(having_max_lastName);

        String maxFirstChar = Stream.of("Aryan", "Tom", "Harry", "Steve")
                .max(Comparator.comparing(String::valueOf))
                .get();
        System.out.println("Larger string lexicographycally is :"+maxFirstChar);

         //multiple custom comparator

        list.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}
