public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Harry","Potter");
        Person person2 = new Person("Hermione","Granger");
        Person person3 = new Person("Ron","Weasley");

        person1.addPoints(100);
        person2.addPoints(420);
        person3.addPoints(231);

        System.out.println("\n"+person1+"\n"+person2+"\n"+person3);


    }
}
