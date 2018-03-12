package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bedroom extends Room {
    private BedroomType type;
    private int roomNumber;

    public Bedroom(BedroomType type, int capacity, int roomNumber, ArrayList<Guest> currentGuests){
        super(capacity, currentGuests);
        this.type = type;
        this.roomNumber = roomNumber;

    }

    public BedroomType getType() {
        return type;
    }

    public int getCostFromEnum() {
        return this.type.getCost();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<Guest> checkWhichGuests(){
        List<Guest> list = currentGuests.stream().peek(Guest::getName).collect(Collectors.toList());
        return (ArrayList<Guest>) list;
    }


}
