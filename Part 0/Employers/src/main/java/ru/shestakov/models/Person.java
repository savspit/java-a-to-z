package ru.shestakov.models;

public class Person {

    Stuff stuff = null;

    public Person(Stuff stuff) {
        this.stuff = stuff;
    }

    public static void main(String args[]) {
        Person person1 = new Person(new Employee("Name", "Surname", 100, 28));
        Person person2 = new Person(new Contractor("Name", "Surname", 80, "Agency"));
        Person person3 = new Person(new Temporary("Name", "Surname", 80, "Agency"));

        person1.test();
        person2.test();
        person3.test();

    }

    public void test() {
        stuff.get_name();
    }

}
