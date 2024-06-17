package DifferentKindOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (items.isEmpty()) {
            this.capacity = item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item it : items) {
            if (it.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
