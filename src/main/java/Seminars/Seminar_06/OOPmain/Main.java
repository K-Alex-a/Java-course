package Seminars.Seminar_06.OOPmain;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Igor");
        employee.setAge(20);

        Employee another = new Employee();
        another.setName("Mary");
        another.setAge(21);

        Employee another2 = new Employee("Sergey", 40);


        System.out.println(employee.isOlderThan(100));  //false
        System.out.println(another.isOlderThan(20));    //true

    }


}
