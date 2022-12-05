public class Person {
    String name, sex;
    int age;

//    Person() {
//
//    }
    Person(String name,String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    void CheckStatus() {
        System.out.println("Name : " + name);
        System.out.println("Sex  : " + sex);
        System.out.println("Age  : " + sex);
    }
}