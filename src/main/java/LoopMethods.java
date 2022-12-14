import java.util.Arrays;
import java.util.Collections;

public class LoopMethods {

    public int calculateTotalPoints(Person[] personer){
    int sum = 0;
        for (Person person: personer){
        sum += person.getPoints();
        }
        return sum;
    }
    public Person minPoints(Person[] personer){

       Arrays.sort(personer,new ComparatorPoints());
       return personer[0];
    }
    public Person maxPoints(Person[] personer){
        Arrays.sort(personer, new ComparatorPoints());
        return personer[personer.length-1];
    }



}
