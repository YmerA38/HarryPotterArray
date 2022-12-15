import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        LoopMethods loopMethods = new LoopMethods();

        Person person1 = new Person("Harry","Potter");
        Person person2 = new Person("Hermione","Granger");
        Person person3 = new Person("Ron","Weasley");

        person1.addPoints(100);
        person2.addPoints(420);
        person3.addPoints(231);

        //Person[] personer = {person1,person2,person3};
        ArrayList<Person> personer = new ArrayList<>();
        personer.add(person1);
        personer.add(person3);
        personer.add(person2);
        Person person4 = new Person("Ginny","Weasley");
        person4.addPoints(1000);
        personer.add(1,person4);
        Person person5 = new Person("Draco","Malfoy");
        person5.addPoints(215);
        personer.add(person5);
        Person person6 = new Person("Nevil","Longbottom");
        person6.addPoints(7);
        personer.add(person6);
        System.out.println(personer);
        for (Person person : personer){
            System.out.println(person);
        }
        System.out.println("total point :"+loopMethods.calculateTotalPoints(personer));
        Person p = loopMethods.minPoints(personer);
        System.out.println(p.getFirstName()+" har færrest point, med kun "+p.getPoints()+" point");
        p = loopMethods.maxPoints(personer);
        System.out.println(p.getFirstName()+" har flest point, med hele "+p.getPoints()+" point");
        System.out.println("Gennemsnittet er : "+loopMethods.avgPoints(personer));

        //System.out.println("\n"+person1+"\n"+person2+"\n"+person3);


    }
}
