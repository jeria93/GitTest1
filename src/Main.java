//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Profession profession = new Profession("Janitor");
        Person p1 = new Person(profession);
        String myLastName = p1.lastName("Jeria");
        System.out.println(myLastName);
        System.out.println(p1.profession.profession);


    }
}