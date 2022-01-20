import app.Name;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void testGetFirstName() {
        Name name = new Name("SYED", "SHAHRUKH");
        assertEquals("SYED", name.getFirstName());
    }

    @Test
    public void getLastName() {
        Name name = new Name("SYED", "SHAHRUKH");
        assertEquals("SHAHRUKH", name.getLastName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLastNameEmpty() {
        Name name = new Name("SYED", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getFirstNameEmpty() {
        Name name = new Name("", "SHAHRUKH");
    }
}