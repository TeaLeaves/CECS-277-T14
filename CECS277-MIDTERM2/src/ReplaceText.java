/**
 * Tina L Vu
 * 10/28/20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

//816 words
public class ReplaceText {
    /**
     Prompts for and reads name of file to process.
     @param in Scanner from which to read
     @return file name
     */
    private static String getFileName(Scanner in)
    {
        String filename = null;
        //prompt the user for the input file name
        System.out.print("Enter File Name: ");
        if (in.hasNext()) {
            filename = in.next();
        }
        return filename;
    }

    /**
     Reads sales data from the specified file.
     @param filename name of sales data file
     */
    private static ArrayList<String> readOldFile(String filename)
            throws FileNotFoundException {
        ArrayList<String> oldFile = new ArrayList<String>();

        if (filename != null) {
            try (Scanner infile = new Scanner(new File(filename))) {
                while (infile.hasNext()) {
                    infile.useDelimiter(" ");
                    oldFile.add(infile.next());
                }
            }
        }
        return oldFile;
    }

    public static void main(String[] args) {
        try {
            //read the text file
            Scanner in = new Scanner(System.in);
            String filename = getFileName(in);
            System.out.println("\n");

            //create an array from the text file
            ArrayList<String> oldFile = readOldFile(filename);

            //prompt user for output filename
            System.out.print("Enter a Name for the Output File: ");

            //get the name for PrintWriter
            String newFileName = CheckInput.getString();
            System.out.println("\n");

            //create the new text file + open printWriter
            String nametxt = newFileName + ".txt";
            PrintWriter file = new PrintWriter(nametxt);

            //java ReplaceText oldstring newstring
            //change "the" from randomwords.txt to "abc"
            for(int i = 0; i < oldFile.size(); i++){
                if(oldFile.get(i).contains("the")){
                    file.println(oldFile.get(i).replace("the","abc"));
                }
                else{
                    file.println(oldFile.get(i));
                }

            }
            //close the new text file to generate it
            file.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("File format not valid.");
        }
    }
}
