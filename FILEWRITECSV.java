import javax.swing.*;
import java.io.*;
public class FILEWRITECSV
{
    // file object to open, read and close a file
    private FileWriter fWriter; // an object to fetch data from file 

    // (no class constructor, jusu use default constructor)

    public void writeCSVtable(String outBuffer) throws IOException
    {
        String csvFile;
        // create a file chooser 
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser (currentDir);
        // in response to a button click:
        // open file
        File file = fc.getSelectedFile();
        // obtain filename
        csvFile = file.getName();

        // open the file 
        fWriter = new FileWriter(csvFile);
        // write ALL the to the file in 1 burst
        fWriter.write(outBuffer);
        // close the file 
        fWriter.close();
    }
    // classes to open, create, read/write, close files 
    FILEWRITECSV resultfile;  // to write data to storage

    public void countOKtickets() throws IOException
    {
        // prepare a string to write data to disc
        String fileContent = "";

        //start the count
        int count = 0;
        // loop for each item : member

        // decide if current item: member matches target: ticket
        {
            //add 1 to count: for OK ticket
            count = count +1;
            //display the details for the customer

            // use new line to seperate rows in csv file, after 1st line
            if (count>1)
            {
                fileContent = fileContent.concat("\n");
            }
        }

    }
}
