package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    public ArrayList<Hotel.Guest> currentGuests;

    public Room(int capacity, ArrayList<Guest> currentGuests){
        this.capacity = capacity;
        this.currentGuests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getCurrentGuests() {
        return currentGuests;
    }

    public void setCurrentGuests(ArrayList<Guest> currentGuests) {
        this.currentGuests = currentGuests;
    }

    public void addGuest(Guest guest){
        this.currentGuests.add(guest);
    }

    public int countGuests() {
       return currentGuests.size();
    }
}
