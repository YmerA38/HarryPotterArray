import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Harry","Potter");
        Person person2 = new Person("Hermione","Granger");
        Person person3 = new Person("Ron","Weasley");

        person1.addPoints(100);
        person2.addPoints(420);
        person3.addPoints(231);

        Person[] personer = {person1,person2,person3};
        System.out.println(Arrays.toString(personer));
        for (Person person : personer){
            System.out.println(person);
        }

        //System.out.println("\n"+person1+"\n"+person2+"\n"+person3);


    }
}
