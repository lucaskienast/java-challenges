package com.kienast.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntroductionMain {

    public static void main(String[] args) {
        //new Thread(new CodeToRun()).start();

        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable");
            }
        }).start();
         */

        //new Thread(() -> System.out.println("Printing from the Runnable")).start();

        /*
        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();
         */

        Employee john = new Employee("John Doe", 30);
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

        /*
       String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());
         */

        /*
        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
         */

        /*
        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
         */

        String sillyString = doStringStuff(
                (s1, s2) -> s1.toUpperCase() + s2.toUpperCase(),
                employees.get(0).getName(), employees.get(1).getName());

        System.out.println(sillyString);

        AnotherClass ac = new AnotherClass();
        String s = ac.doSomething();
        System.out.println(s);

    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}



interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething() {

        /*
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return IntroductionMain.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");
         */

        /*
        UpperConcat uc = (s1, s2) -> {
            System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return IntroductionMain.doStringStuff(uc, "String1", "String2");
         */

        /*
        int i = 0;
        {
            UpperConcat uc = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    return s1.toUpperCase() + s2.toUpperCase();
                }
            };
            System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());

            i++;
            System.out.println("i = " + i);

            return IntroductionMain.doStringStuff(uc, "String1", "String2");
        }
         */

        int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The anonymous class's name is: " + getClass().getSimpleName());
            System.out.println("i in the lambda expression = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return IntroductionMain.doStringStuff(uc, "String1", "String2");
    }

    public void printValue() {
        int n = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + n);
        };

        new Thread(r).start();
    }
}