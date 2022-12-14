import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Harry","Potter");
        Person person2 = new Person("Hermione","Granger");
        Person person3 = new Person("Ron","Weasley");

        person1.addPoints(100);
        person2.addPoints(420);
        person3.addPoints(231);

        //Person[] personer = {person1,person2,person3};
        Person[] personer = new Person[5];
        personer[0] = person1;
        personer[2] = person3;
        personer[3] = person2;

        Person person4 = new Person("Ginny","Weasley");
        person4.addPoints(1000);
        personer[1] = person4;
        Person person5 = new Person("Draco","Malfoy");
        person5.addPoints(215);
        personer[4] = person5;
        Person person6 = new Person("Nevil","Longbottom");
        person6.addPoints(7);
        personer[4] = person6;
        System.out.println(Arrays.toString(personer));
        for (Person person : personer){
            System.out.println(person);
        }

        //System.out.println("\n"+person1+"\n"+person2+"\n"+person3);


    }
}
