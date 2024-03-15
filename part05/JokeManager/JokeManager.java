package JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager(){
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }

    public String drawJoke(){
        if(jokes.isEmpty()){
            System.out.println("Jokes are in short supply.");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(jokes.size());
        return this.jokes.get(randomIndex);
    }
}
