public class Main {
    public static void main(String[] args) {

        Person p = new Person("Paula", "Female", 36);
        Person t = new Toddler("Lukasz", "Male", 2, "Hide-And-Seek");
        Person k = new Kid("Paul", "Male", 4, "Peek-A-Boo", 5) ;


        p.name = "David";
        p.sex = "Male";
        p.age = 18;


        t.name = "Paula";
        t.sex = "Female";
        t.age = 1;

        p.CheckStatus();
        t.CheckStatus();

        t.drink();
        k.sayGradeLevel();

    }
}
