package zjazd6;

/*
    Author: Marcel Pankanin  
    PoliticalCandidate class implemented in Java
    Date: 17.05.2020
*/
public class PoliticalCandidate implements Runner {
    private String name;

    public PoliticalCandidate(String name) {
        this.name = name;
    }

    @Override
    public String run() {
        return "I'm going to run in 2020 presidential election";
    }

    @Override
    public String toString() {
        return "I'm " +
                name + " and " +
                run();
    }
}
