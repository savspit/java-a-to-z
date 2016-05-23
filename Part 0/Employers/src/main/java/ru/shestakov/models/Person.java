package ru.shestakov.models;

public class Person {

    Stuff stuff = null;

    public Person(Stuff stuff) {
        this.stuff = stuff;
    }

    public static void main(String args[]) {
        Person person1 = new Person(new Employee());
        Person person2 = new Person(new Contractor());
        Person person3 = new Person(new Temporary());

        person1.test();
        person2.test();
        person3.test();

    }

    public void test() {
        stuff.get_name();
    }

}
