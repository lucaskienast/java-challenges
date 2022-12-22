package com.kienast.lambdas;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "I26", "I17", "I29", "O71", "g64");

        List<String> gNumbers = new ArrayList<>();

        someBingoNumbers.forEach(n -> {
            if (n.toUpperCase().startsWith("G")) {
                gNumbers.add(n);
                //System.out.println(n);
            }
        });

        //gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        gNumbers.sort(String::compareTo);
        //gNumbers.forEach(n -> System.out.println(n));
        gNumbers.forEach(System.out::println);
        
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        someBingoNumbers.forEach(System.out::println);

        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("date", "elderberry", "fig");
        Stream<String> stream = Stream.concat(list1.stream(), list2.stream()).distinct();
        stream.forEach(System.out::println);

        Stream<String> stream2 = Stream.of(list1, list2).flatMap(List::stream).distinct();
        stream2.forEach(System.out::println);

        Employee john = new Employee("John Doe", 31);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(tim);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        hr.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(d -> d.getEmployees().stream()).forEach(System.out::println);

        /*
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .toList();
         */

        /*
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());
         */

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        sortedGNumbers.forEach(System.out::println);

        Map<Integer, List<Employee>> groupedByAge = departments
                .stream()
                .flatMap(d -> d.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        groupedByAge.entrySet().forEach(System.out::println);

        departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String textToSplit = "Let's split this up into an array";
                Arrays.stream(textToSplit.split(" ")).toList().forEach(System.out::println);
            }
        };

        Runnable runnable2 = () -> {
            String textToSplit = "Let's split this up into an array";
            Arrays.stream(textToSplit.split(" ")).toList().forEach(System.out::println);
        };

        Function<String, String> everySecondChar = s ->
            IntStream.range(0, s.length())
                    .filter(i -> i %2 == 0)
                    .mapToObj(s::charAt)
                    .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

        String input = "abcdefghijklmnopqrstuvwxyz";
        String output = everySecondChar.apply(input);
        System.out.println(output);
        System.out.println(everySecondCharFunction(everySecondChar, input));

        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        Callable<String> task = () -> "Task completed";

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(task);

        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdownNow();
        }

        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");
        /*
        List<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach(n -> firstUpperCaseList.add(n.substring(0, 1).toUpperCase() + n.substring(1)));
        firstUpperCaseList.stream().sorted(String::compareTo).forEach(System.out::println);
        */
        List<String> firstUpperCaseList = topNames2015
                .stream()
                .map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        firstUpperCaseList.forEach(System.out::println);

        long noNamesWithA = topNames2015.stream().filter(n -> n.toUpperCase().startsWith("A")).count();
        System.out.println(noNamesWithA);


    }

    public static String everySecondCharFunction(Function<String, String> func, String source) {
        return func.apply(source);
    }

}
