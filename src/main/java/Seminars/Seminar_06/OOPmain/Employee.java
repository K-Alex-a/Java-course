package Seminars.Seminar_06.OOPmain;

public class Employee {
    private String name;
    private int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(){
    }

    public Employee(String name) {
        this(name, 18);
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

    public boolean isOlderThan(int trashHolder) {
        return age > trashHolder;
    }
}
