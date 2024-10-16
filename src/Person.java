public class Person {

    String name;
    int age;
    Profession profession;

    public Person(Profession profession) {

        name = "nicholas";
        age = 18;
        this.profession = profession;

    }

    public String lastName(String lastName) {

        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession=" + profession +
                '}';
    }
}
