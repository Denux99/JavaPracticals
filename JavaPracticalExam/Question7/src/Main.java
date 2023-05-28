
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age= age;
    }

//    public String getName(){
//        return name;
//    }
//
//    public int getAge(){
//        return getAge();
//    }
}

public class Main {
    public static void main(String[] args) {

//        String name = "Thennakoon";
//        int age = 25;
        Person newPerson = new Person("Naveen", 24);

        System.out.println(newPerson.name);
        System.out.println(newPerson.age);

    }
}