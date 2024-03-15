package ToDoList;

import java.util.Scanner;

public class UserInterface {
    private ToDoList todolist;
    private Scanner scanner;

    public UserInterface(Scanner scanner, ToDoList todolist){
        this.scanner= scanner;
        this.todolist = todolist;
    }

    public void start(){
        while (true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if( command.equals("stop")){
                System.out.println("Thank you for using my todolist!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Todo: ");
                String todo = scanner.nextLine();
                this.todolist.add(todo);
            } else if (command.equals("list")) {
                this.todolist.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is to remove? ");
                int numberToRemove = Integer.parseInt(scanner.nextLine());
                this.todolist.remove(numberToRemove);
            }
        }
    }
}
