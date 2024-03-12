package Archive;

import java.util.Objects;

public class Item {
    private String name;
    private String identifier;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) compared;
        return this.identifier.equals(comparedItem.identifier);

    }

}
