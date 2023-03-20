package org.example.seminar4.cw.task2;

public class Cat extends Animal{
//    private String name;
//    private int age;

    public Cat(String name, int age) {
        super(name, age);
//        this.name = name;
//        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
