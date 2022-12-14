import java.util.Comparator;

public class ComparatorPoints implements Comparator<Person> {

    public int compare(Person a, Person b) {
        if (a.getPoints() > b.getPoints()) {
            return 1;
        } else if (a.getPoints() < b.getPoints()) {
            return -1;
        } else {
            return 0;
        }
    }


}
