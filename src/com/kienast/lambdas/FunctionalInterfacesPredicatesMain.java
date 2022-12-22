package com.kienast.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.IntStream;

public class FunctionalInterfacesPredicatesMain {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 31);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        /*
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        for (Employee e : employees) {
            System.out.println(e.getName());
        }
         */

        //employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.sort(Comparator.comparing(Employee::getName));
        //employees.forEach(e -> System.out.println(e.getName()));

        employees.forEach(e -> {
            System.out.println(e.getName());
            System.out.println(e.getAge());
            //new Thread(() -> System.out.println(e.getAge())).start();
        });

        employees.stream().filter(e -> e.getAge() > 30).forEach(e -> System.out.println(e.getName()));

        printEmployeesByAge(employees, "Employees over 30", e -> e.getAge() > 30);
        printEmployeesByAge(employees, "Employees under 29", e -> e.getAge() < 29);

        IntPredicate intpGreater15 = i -> i > 15;
        IntPredicate intpSmaller100 = i -> i < 100;
        System.out.println(intpGreater15.and(intpSmaller100).test(60));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        IntStream.range(1, 11).forEach(i -> System.out.println(randomSupplier.get()));

        Function<Employee, String> getLastName = (Employee e) -> e.getName().substring(e.getName().indexOf(' ') + 1);

        //String lastName = getLastName.apply(employees.get(3));
        //System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee e) -> e.getName().substring(e.getName().indexOf(' '));

        employees.forEach(e -> {
            if (random.nextBoolean())
                System.out.println(getAName(getFirstName, e));
            else
                System.out.println(getAName(getLastName, e));
        });

        Function<Employee, String> upperCase = e -> e.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> name.concat(" " + employee.getAge());

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello, World");

    }

    private static String getAName(Function<Employee, String> getName, Employee e) {
        return getName.apply(e);
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        employees.stream().filter(ageCondition).forEach(e -> System.out.println(e.getName()));
    }

}
