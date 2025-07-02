package Day5;

import java.util.Arrays;

class Person {
    String name;
    int age;
    int phone;
    char grade;

    Person(String name, int age, int phone, char grade) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + "{ Age: " + age + ", Phone: " + phone + ", Grade: " + grade + "} ," + "\n";
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Deep", 23, 987654321, 'A'),
                new Person("Prishu", 19, 987654321, 'D'),
                new Person("Saurabha", 24, 987654321, 'B'),
                new Person("Jasii", 22,  987654321, 'C'),
        };
        Arrays.sort(persons, (a,b) -> a.age - b.age);
        System.out.println("Sort on age: "+ Arrays.toString(persons));

        Arrays.sort(persons, (a,b) -> a.name.length() - b.name.length());
        System.out.println("Sort on name length: "+ Arrays.toString(persons));

        Arrays.sort(persons, (a,b) -> a.grade - b.grade);
        System.out.println("Sort on grade: "+ Arrays.toString(persons));

        Arrays.sort(persons, (a,b) -> b.name.compareTo(a.name));
        System.out.println("Sort on grade: "+ Arrays.toString(persons));
    }
}


