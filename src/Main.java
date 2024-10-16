import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Profession profession = new Profession("Janitor");
        Profession profession1 = new Profession("Waitress");
        Person p1 = new Person(profession);
        Person p2 = new Person(profession1);
        String myLastName = p1.lastName("Jeria");
        System.out.println(myLastName);
        System.out.println(p1.profession.profession);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);

        for (Person p : people) {
            System.out.println(p.profession.profession);
        }

    }
}