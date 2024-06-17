package HeightOrder;

import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public void goOutFromRoom(){
        persons.clear();
    }

    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person returnedObject = persons.get(0);
        for(Person person : persons){
            if(returnedObject.getHeight() > person.getHeight()){
                returnedObject = person;
            }
        }
        return  returnedObject;
    }

    public Person take(){
       if(this.isEmpty()){
           return null;
       }
       Person shortest = this.shortest();
       this.persons.remove(shortest);
       return shortest;
    }
}
