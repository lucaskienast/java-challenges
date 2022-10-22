package com.kienast;

import com.kienast.abstractClass.MyList;
import com.kienast.abstractClass.Node;
import com.kienast.arrayList.MobilePhone;
import com.kienast.autoboxing.Bank;
import com.kienast.interfaces.ISaveable;
import com.kienast.interfaces.Monster;
import com.kienast.interfaces.Player;
import com.kienast.oop.burgers.DeluxeBurger;
import com.kienast.oop.burgers.Hamburger;
import com.kienast.oop.burgers.HealthyBurger;
import com.kienast.oop.car.Car;
import com.kienast.oop.car.Ford;
import com.kienast.oop.car.Holden;
import com.kienast.oop.car.Mitsubishi;
import com.kienast.oop.carpetCost.Calculator;
import com.kienast.oop.carpetCost.Carpet;
import com.kienast.oop.carpetCost.Floor;
import com.kienast.oop.complexNumber.ComplexNumber;
import com.kienast.oop.cylinder.Circle;
import com.kienast.oop.cylinder.Cylinder;
import com.kienast.oop.person.Person;
import com.kienast.oop.point.Point;
import com.kienast.oop.pool.Cuboid;
import com.kienast.oop.pool.Rectangle;
import com.kienast.oop.printer.Printer;
import com.kienast.oop.sumCalculator.SumCalculator;
import com.kienast.oop.wallArea.Wall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.kienast.arrays.MinimumElement.*;
import static com.kienast.arrays.ReverseArray.*;
import static com.kienast.arrays.SortedArray.*;
import static com.kienast.intro.areaCalculator.AreaCalculator.area;
import static com.kienast.intro.paintJob.PaintJob.getBucketCount;

public class Main {

    public static void main(String[] args) {

        // Q1: Speed converter
        /*
        System.out.println("100 km/h = " + toMilesPerHour(100d) + " mi/h");
        printConversion(100d);
         */


        // Q2: Megabytes converter
        // printMegaBytesAndKiloBytes(2500);


        // Q3: Barking dog
        /*
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
         */


        // Q4: Leap year calculator
        /*
        isLeapYear(1700); // false
        isLeapYear(1800); // false
        isLeapYear(1900); // false

        isLeapYear(1600); // true
        isLeapYear(2000); // true
        isLeapYear(2400); // true
         */


        // Q5: Decimal comparator
        /*
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
         */


        // Q6: Equal sum checker
        /*
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
         */


        // Q7: Area calculator
        /*
        area(5.0);
        area(-1.0);
        area(5.0, 4.0);
        area(-1.0, 4.0);
         */


        // Q8: Minutes to years and days
        /*
        printYearsAndDays(-1);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
         */


        // Q9: Playing cats
        /*
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
         */


        // Q10: Number of days
        /*
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
         */


        // Q11: Sum odd
        /*
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
         */


        // Q12: Sum digits
        /*
        sumDigits(125);
        sumDigits(-1);
         */


        // Q13: Number palindrome
        /*
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(1221);
        isPalindrome(12321);
        isPalindrome(1);
        isPalindrome(211);
        isPalindrome(1121);
        isPalindrome(11421);
         */


        // Q14: First and last digit sum
        /*
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(1000001);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
         */


        // Q15: Even digit sum
        /*
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
         */


        // Q16: Shared digit
        /*
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
        hasSharedDigit(24, 67);
         */


        // Q17: Last digit checker
        /*
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
         */


        // Q18: Greatest common divisor
        /*
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
         */

        // Q19: All factors
        /*
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
         */


        // Q20: Perfect number
        /*
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
         */


        // Q21: Number to words
        /*
        numberToWords(123);
        numberToWords(509);
        numberToWords(-1);
         */


        // Q22: Flour packer
        /*
        canPack(1, 0, 4);
        canPack(1, 0, 5);
        canPack(0, 5, 4);
        canPack(2, 2, 11);
        canPack(-3, 2, 12);
         */


        // Q23: Largest prime
        /*
        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);
         */


        // Q24: Diagonal star
        /*
        printSquareStar(20);
         */


        // Q25: Input calculator
        /*
        inputThenPrintSumAndAverage();
         */


        // Q26: Paint job
        /*
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);
        getBucketCount(-3.4, 2.1, 1.5);
        getBucketCount(3.4, 2.1, 1.5);
        getBucketCount(7.25, 4.3, 2.35);
         */


        // Q27: Sum calculator
        /*
        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
         */


        // Q28: Person
        /*
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
         */


        // Q29: Wall area
        /*
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
         */


        // Q30: Point
        /*
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
         */


        // Q31: Carpet cost calculator
        /*
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
         */


        // Q32: Complex operations
        /*
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
         */


        // Q33: Cylinder
        /*
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
         */


        // Q34: Pool area
        /*
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
         */


        // Q35: Printer
        /*
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
         */


        // Q36: Car polymorphism
        /*
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
         */


        // Q37: Burger app
        /*
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
         */


        // Q38: Sorted array
        /*
        int[] myIntegers = getIntegers(5);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printArray(sortedIntegers);
         */


        // Q39: Minimum element
        /*
        int numElements = readInteger();
        int[] intArr = readElements(numElements);
        int min = findMin(intArr);
         */


        // Q40: Reverse array
        /*
        int numElements = getArrayLength();
        int[] intArr = getArrayElements(numElements);
        int[] revArr = getReversedArray(intArr);
         */


        // Q41: Mobile phone
        /*
        MobilePhone mobilePhone = new MobilePhone("Max");
        mobilePhone.startPhone();
         */


        // Q42: Banking
        /*
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Tim", "Adelaide", 50.05);
        bank.addCustomer("Mike", "Adelaide", 175.34);
        bank.addCustomer("Percy", "Adelaide", 220.12);

        bank.addCustomerTransaction("Tim", "Adelaide", 44.22);
        bank.addCustomerTransaction("Tim", "Adelaide", 12.44);
        bank.addCustomerTransaction("Mike", "Adelaide", 1.65);

        bank.listCustomers("Adelaide", true);
         */


        // Q43: Playlist
        // see linked list package


        // Q44: Savable
        /*
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim);
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);

        tim.setWeapon("Axe");
        saveObject(tim);
        // loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
         */


        // Q45: Abstract class
        MyList list = new MyList(null);
        list.traverse(list.getRoot());

        // String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");

        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }

    /*
    // Q44: Savable
    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }

    public static List<String> readValues() {
        List<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose 1 to enter a value and 0 to quit...");

        while (!quit) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    String input = sc.nextLine();
                    values.add(index, input);
                    index++;
                    break;
            }
        }
        return values;
    }
     */

}
