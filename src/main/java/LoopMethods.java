import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LoopMethods {

    public int calculateTotalPoints(ArrayList<Person> personer){
    int sum = 0;
        for (Person person: personer){
        sum += person.getPoints();
        }
        return sum;
    }
    public Person minPoints(AbstractList<Person> personer){

       Collections.sort(personer,new ComparatorPoints());
       return personer.get(0);
    }
    public Person maxPoints(ArrayList<Person> personer){
        Collections.sort(personer, new ComparatorPoints());
        return personer.get(personer.size()-1);
    }
    public int avgPoints(ArrayList<Person> personer){
        return calculateTotalPoints(personer)/personer.size();
    }
    public Person findByFirstName(ArrayList<Person> personer,String search){
        for (Person person:personer){
            if(person.getFirstName().equals(search)) {
                return person;
            }
        }
        return null;
    }



}
