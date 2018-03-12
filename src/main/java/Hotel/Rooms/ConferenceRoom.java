package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, String name, ArrayList<Guest> currentGuests){
        super(capacity, currentGuests);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
