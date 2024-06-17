package JokeManager;

import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
     private Scanner scanner;

     public UserInterface(JokeManager jokeManager, Scanner scanner){
         this.jokeManager = jokeManager;
         this.scanner = scanner;
     }

     public void start(){
         while(true){
             System.out.println("Command: ");
             String command = scanner.nextLine();
             if(command.equals("x")){
                 System.out.println("Thank you for using my joke manager!");
                 break;
             }else if(command.equals("1")){
                 String joke = scanner.nextLine();
                 this.jokeManager.addJoke(joke);
             } else if (command.equals("2")) {
                 System.out.println(this.jokeManager.drawJoke());
             } else if(command.equals("3")){
                 this.jokeManager.printJokes();
             }else {
                 System.out.println("Unknown command!");
             }
         }
     }

}
