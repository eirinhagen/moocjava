package ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String task){
        this.tasks.add(task);
    }

    public void print(){
        for(String task : tasks){
            System.out.println((tasks.indexOf(task)+1)+". "+ task);
        }
    }

    public void remove(int number){
        this.tasks.remove(tasks.get(number-1));
    }

}
