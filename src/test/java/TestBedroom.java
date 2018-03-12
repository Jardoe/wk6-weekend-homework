import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    Bedroom bedroom1, bedroom2;
    Guest guest;
    ArrayList<Guest> currentGuests;

    @Before
    public void before() {
        bedroom1 = new Bedroom(BedroomType.SINGLE, 1, 101, null);
        guest = new Guest("Steve");
    }

    @Test
    public void canGetRoomType(){
        assertEquals(BedroomType.SINGLE, bedroom1.getType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void canGetCost() {
        assertEquals(20, bedroom1.getCostFromEnum());
    }

    @Test
    public void bedroomHasRoomNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }


    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest);
        assertEquals(1, bedroom1.countGuests());
    }


}
