import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(50, null);
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, diningRoom.getCapacity());
    }
}
