import java.io.IOException;
import java.io.PrintWriter;

/**
 * create a program that asks a hotel salesperson to enter their sales information
 * and then add those information into a text file called 'sales.txt'
 */
public class Main {
    public static void main(String[] args) {
        //get the number of lines, of sales info, being inserted
        System.out.print("Enter number of Lines: ");
        int numLines = CheckInput.getPositiveInt();

        //test to make sure the printwriter works
        try(PrintWriter sales = new PrintWriter("sales.txt")){
            //loop until all of the info is inserted into the txt file
            while(numLines > 0) {
                //ask the user for the lines of sales
                System.out.println("Enter Sales: ");
                System.out.println("(Format: Client Name;Service Type;Cost;Month/Date/Year)");
                //get a string of txt (name:service:amount:date)
                String line = CheckInput.getString();

                //create an array that will be used to make sure
                //that the user's input is correct
                String[] split = line.split(";");

                //by checking if it has 4 categories
                while(split.length != 4){
                    System.out.println("INPUT ERROR, Check ';' ");
                    //get a string of txt (name:service:amount:date)
                    line = CheckInput.getString();
                    //check if user's input is correct
                    split = line.split(";");
                }
                //by making sure date has valid syntax and amount
                String[] splitDate = split[3].split("/");
                while(splitDate.length != 3){
                    System.out.println("INPUT ERROR, Check DATE ");
                    //get a string of txt (name:service:amount:date)
                    line = CheckInput.getString();
                    //check if user's input is correct
                    split = line.split(";");
                    //split the date again
                    splitDate = split[3].split("/");
                }
                //make sure data has 3 valid integers
                boolean valid = false;
                while(valid) {
                    int month = Integer.parseInt(splitDate[0]);
                    int date = Integer.parseInt(splitDate[1]);
                    int year = Integer.parseInt(splitDate[2]);

                    //check if month is correct
                    if( month < 0 || month > 12 || Float.isNaN(month)){
                        System.out.println("INPUT ERROR, Check DATE ");
                        //get a string of txt (name:service:amount:date)
                        line = CheckInput.getString();
                        //check if user's input is correct
                        split = line.split(";");
                        //split the date again
                        splitDate = split[3].split("/");
                    }
                    //check if date is correct
                    else if( date < 0 || date > 31 || Float.isNaN(date)){
                        System.out.println("INPUT ERROR, Check DATE ");
                        //get a string of txt (name:service:amount:date)
                        line = CheckInput.getString();
                        //check if user's input is correct
                        split = line.split(";");
                        //split the date again
                        splitDate = split[3].split("/");
                    }
                    //check if year is valid
                    else if( year < 1900 || year > 2020 || Float.isNaN(year)){
                        System.out.println("INPUT ERROR, Check DATE ");
                        //get a string of txt (name:service:amount:date)
                        line = CheckInput.getString();
                        //check if user's input is correct
                        split = line.split(";");
                        //split the date again
                        splitDate = split[3].split("/");
                    }
                    //if everything is correct
                    else{
                        valid = true;
                    }
                }
                //make sure the cost if a float
                while(Double.isNaN(Double.parseDouble(split[2]))){
                    System.out.println("INPUT ERROR, Check Cost");
                    //get a string of txt (name:service:amount:date)
                    line = CheckInput.getString();
                    //check if user's input is correct
                    split = line.split(";");
                }


                //add the line into the txt file
                sales.println(line);

                //subtract numLines
                numLines--;
            }
            //close the txt file
            sales.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //announce that the txt file 'sales' was successfully made
        System.out.println("Your Text File was Made :)");
    }
}
