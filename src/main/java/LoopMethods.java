public class LoopMethods {

    public int calculateTotalPoints(Person[] personer){
    int sum = 0;
        for (Person person: personer){
        sum += person.getPoints();
        }
        return sum;
    }
}
