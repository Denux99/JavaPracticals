
class Person {
    String name;
    int age;

    static class Employee extends Person {
        int salary;
    }


    public static class Main {
        public static void main(String[] args) {

            Employee newEmployee = new Employee();
            newEmployee.name = "Naveen";
            newEmployee.age = 30;
            newEmployee.salary = 60000;

            System.out.println("Name: " + newEmployee.name);
            System.out.println("Age: " + newEmployee.age);
            System.out.println("Salary: " + newEmployee.salary);
        }
    }
}