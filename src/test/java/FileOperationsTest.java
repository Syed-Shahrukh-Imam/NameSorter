
import app.FileOperations;
import app.Name;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FileOperationsTest {


    @Test(expected = IllegalArgumentException.class)
    public void testInputFileEmpty() {
        FileOperations fileOperations = new FileOperations("");
    }

    @Test
    public void testGetInputFileTest() {
        FileOperations fileOperations = new FileOperations("test-names.txt");
        assertEquals(fileOperations.getInputFile(),"test-names.txt" );

    }
    @Test
    public void testSetInputFileTest() {
        FileOperations fileOperations = new FileOperations("test-names.txt");
        fileOperations.setInputFile("test.txt");
        assertEquals(fileOperations.getInputFile(),"test.txt" );

    }

    @Test
    public void testReadInputFileFunctionality() {
        FileOperations fileOperations = new FileOperations("names.txt");

        ArrayList<Name> names = fileOperations.readInputFile();
        assertNotNull(names);
        assertEquals("BAKER",names.get(0).getLastName());
        assertEquals("SMITH",names.get(1).getLastName());
        assertEquals("KENT",names.get(2).getLastName());
    }



    @Test(expected = IllegalStateException.class)
    public void testMissingName() {
        FileOperations fileOperations = new FileOperations("test-names-missing.txt");
        fileOperations.readInputFile();
    }






}