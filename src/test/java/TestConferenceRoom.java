import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    ConferenceRoom conRoom;

    @Before
    public void before() {
        conRoom = new ConferenceRoom(10, "A", null);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, conRoom.getCapacity());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("A", conRoom.getName());
    }
}
