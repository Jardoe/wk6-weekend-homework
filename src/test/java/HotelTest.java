import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.BedroomType;
import org.junit.Before;
import Hotel.Hotel;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    ArrayList<Bedroom> bedrooms;
    Guest guest1, guest2, guest3;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(BedroomType.TWIN, 2, 101, null);
        bedrooms = new ArrayList<>();
        guest1 = new Guest("Steve");
        guest2 = new Guest("Richard");
        guest3 = new Guest("Henry");

    }

    @Test
    public void hotelHasRooms(){
        hotel.addRoom(bedroom1);
        assertEquals(1, hotel.countRooms());
    }

    @Test
    public void hotelCanCheckInGuestToRoom(){
        hotel.checkin(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void hotelCannotCheckInMoreThanCapacity(){
        hotel.checkin(guest1, bedroom1);
        hotel.checkin(guest2, bedroom1);
        hotel.checkin(guest3, bedroom1);
        assertEquals(2, bedroom1.countGuests());
    }

    @Test
    public void hotelCanCheckRoom_None(){
        assertEquals(0, hotel.checkRoom(bedroom1));
    }

    @Test
    public void hotelCanCheckRoom_one(){
        hotel.checkin(guest1, bedroom1);
        assertEquals("Steve", hotel.checkRoom(bedroom1));
    }


}
