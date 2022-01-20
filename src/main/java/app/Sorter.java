package app;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter{
    /**
     * This method is used to sort the names.
     * @param nameToBeSort - Array List to be sorted
     * @return Sorted Array List
     */
    public ArrayList<Name> sortNames (ArrayList<Name> nameToBeSort ){
        if(nameToBeSort == null){
            throw new IllegalArgumentException("Parsed array cannot be null.");
        }
        nameToBeSort.sort(new Comparator<Name>() {
            @Override
            public int compare(Name o1, Name o2) {
                return o1.getLastName().compareTo(o2.getLastName()); // Comparision
            }
        });
        return nameToBeSort;
    }

    public static void main(String[] args) {
        String inputFile = args[0];
        FileOperations fileOperations = new FileOperations(inputFile);
        Sorter sorter = new Sorter();
        ArrayList<Name> names2 = sorter.sortNames(fileOperations.readInputFile());
        fileOperations.generateOutputFile(names2);
     }
}
