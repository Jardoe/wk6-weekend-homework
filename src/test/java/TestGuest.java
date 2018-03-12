import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1, guest2;

    @Before
    public void before(){
        guest1 = new Guest("Steve");
        guest2 = new Guest("Henry");
    }

    @Test
    public void guestHasName(){
        assertEquals("Steve", guest1.getName());
    }
}
