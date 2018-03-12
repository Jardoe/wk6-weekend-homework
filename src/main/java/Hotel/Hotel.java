package Hotel;

import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import java.util.ArrayList;

public class Hotel{

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conRooms;

    public Hotel(){
        bedrooms = new ArrayList<>();
        conRooms = new ArrayList<>();
    }


    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConRooms() {
        return conRooms;
    }

    public void setConRooms(ArrayList<ConferenceRoom> conRooms) {
        this.conRooms = conRooms;
    }

    public int countRooms(){
       return this.bedrooms.size();
    }

    public void addRoom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }


    public void checkin(Guest guest, Bedroom bedroom) {
        if(bedroom.countGuests() < bedroom.getCapacity())
        {
        bedroom.addGuest(guest);
        }
    }

    public Object checkRoom(Bedroom bedroom) {
        return bedroom.checkWhichGuests();
    }
}
