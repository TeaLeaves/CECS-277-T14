import java.io.*;
import java.util.*;

public class Main2 {
    /**
     Prompts for and reads name of file to process.
     @param in Scanner from which to read
     @return file name
     */
    private static String getFileName(Scanner in)
    {
        String filename = null;
        System.out.print("Enter file to process: ");
        if (in.hasNext()) {
            filename = in.next();
        }
        return filename;
    }

    /**
     Read a sales entry from input Scanner.
     @param in Scanner from which to read entry
     */
    private static Sale readSaleEntry(Scanner in){
        String inputLine = in.nextLine();
        Scanner lineScan = new Scanner(inputLine);
        lineScan.useDelimiter(";");

        //YOUR CODE TO INPUT name, service, amount, and date.
        //call name + grab it from scanner
        String name = lineScan.next();
        //call service + grab it from scanner
        String service = lineScan.next();
        //call amount + + grab it from scanner
        double amount = lineScan.nextDouble();
        //call date + grab it from scanner
        String date = lineScan.next();

        return new Sale(name, service, amount, date);
    }

    /**
     Reads sales data from the specified file.
     @param filename name of sales data file
     */
    private static ArrayList<Sale> readSalesFile(String filename)
            throws FileNotFoundException
    {
        ArrayList<Sale> sales = new ArrayList<Sale>();

        if (filename != null) {
            //fill in the blank below
            try (Scanner infile = new Scanner(new File(filename)))
            {
                while (infile.hasNext()){
                    //fill in the blank below
                    sales.add(readSaleEntry(infile));
                }
            }
        }
        return sales;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Text File: ");

        try {
            //read the text file
            Scanner in = new Scanner(System.in);
            String filename = getFileName(in);

            //create an array from the text file
            ArrayList<Sale> sales = readSalesFile(filename);

            //create new text files for each unique service category
            for(int i = 0; i < sales.size(); i++) {
                //array of services
                ArrayList<String> services = new ArrayList<String>();
                //if the array don't contain that service category, add it
                if(!services.contains(sales.get(i).getServiceCategory())){
                    services.add(sales.get(i).getServiceCategory());
                }
                //make the text files for each of the services in the services array
                for(int j = 0; j < services.size(); j++) {
                    String nametxt = services.get(j) + ".txt";
                    PrintWriter file = new PrintWriter(nametxt);

                    //add the correct sales line into the text file
                    for(int w = 0; w < sales.size(); w++){
                        //if it is the correct category
                        if(sales.get(w).getServiceCategory().equals(services.get(j))){
                            //add it to the file
                            file.println(sales.get(w));
                        }
                    }
                    //close the text files
                    file.close();
                }

            }
            System.out.println("Files Successfully Created :)");
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
