import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {
    private String inputFile;

    public FileOperations(String inputFile){
        if(inputFile.equals("")){
            throw new IllegalArgumentException("Input File cannot be empty.");
        }
        this.inputFile = inputFile;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * Reads the inputFile and returns the user name contents in an Array List.
     * @return ArrayList<Name>
     */
    public ArrayList<Name> readInputFile(){
        try{
            ArrayList<Name> names = new ArrayList<>();
            File file = new File("src/main/resources/"+this.inputFile);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String[] str= reader.nextLine().split(",");
                if(str.length != 2){
                    // Missing first or last name
                    throw new IllegalStateException("Missing first or last name in input file");
                }
                Name name = new Name(str[1].strip(), str[0].strip());
                names.add(name);
            }
            reader.close();
            return names;
        } catch (FileNotFoundException e){
            System.out.println("The input file is not found or does not exist.");
        }
        return null;
    }

    /**
     * Method used to create the output file and write to the created output file.
     * @param names - Array List of the names to be writted
     */
    public void generateOutputFile(ArrayList<Name> names) {
        try{
            String fileNameWithOutExt = this.inputFile.replaceFirst("[.][^.]+$", "");
            File file = new File("src/main/resources/"+fileNameWithOutExt+"-sorted.txt");
            if(file.createNewFile()){
                for(Name n: names){
                    System.out.println(n.getLastName() + ", "+ n.getFirstName());
                }
                FileWriter writer = new FileWriter("src/main/resources/"+fileNameWithOutExt+"-sorted.txt");
                for(Name n: names){
                    writer.write(n.getLastName()+", "+n.getFirstName()+"\n");
                }
                writer.close();
                System.out.println("Finished: created "+fileNameWithOutExt+"-sorted.txt");
            }else{
                System.out.println("The output file already exists");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
