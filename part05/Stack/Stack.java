package Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        stack.add(0, value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        return this.stack.remove(0);
    }
}
