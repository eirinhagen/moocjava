package ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ToDoList todo = new ToDoList();
        todo.add("Clean the room");
        todo.print();
        todo.add("Call John");
        todo.print();

        System.out.println(" ");
        todo.remove(1);
        todo.print();*/

        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        UserInterface test = new UserInterface(scanner, toDoList);
        test.start();
    }
}
