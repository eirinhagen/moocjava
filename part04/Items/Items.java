package Items;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Items {
    private String name;
    private LocalDateTime createdAt;

    public Items(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
