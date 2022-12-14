public class Person {
    private String firstName;
    private String lastName;
    private int points;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0; // det er merge der har lavet denne linie
        this.points = 0;
    }



    @Override
    public String toString(){
        return firstName + " "+lastName+ " har " + points + " point";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void addPoints(int points){
        this.points += points;
    }
}
