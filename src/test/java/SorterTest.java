import app.Name;
import app.Sorter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SorterTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSortNamesFunctionality() {
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("THEODORE","BAKER"));
        names.add(new Name("ANDREW","SMITH"));
        names.add(new Name("MADISON","KENT"));
        names.add(new Name("FREDRICK","SMITH"));
        Sorter sorter = new Sorter();
        sorter.sortNames(names);

        assertEquals("BAKER",names.get(0).getLastName());
        assertEquals("KENT",names.get(1).getLastName());
        assertEquals("SMITH",names.get(2).getLastName());
        assertEquals("FREDRICK",names.get(3).getFirstName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSortNamesNull() {
        ArrayList<Name> names = null;
        Sorter sorter = new Sorter();
        sorter.sortNames(names);
    }


}