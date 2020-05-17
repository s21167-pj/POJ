package zjazd6;

/*
    Author: Marcel Pankanin  
    Athlete class implemented in Java
    Date: 17.05.2020
*/
public class Athlete implements Runner {
    private String name;

    public Athlete(String name) {
        this.name = name;
    }

    @Override
    public String run() {
        return "I'm going to run in marathon";
    }

    @Override
    public String toString() {
        return "I'm " +
                name + " and " +
                run();
    }
}
