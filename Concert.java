import javax.swing.JOptionPane;
import java.io.*;
public class Concert 
{
    //array of CUSTOMER objects 
    private Customer Customerlist[];
    //number of Customers to be calculated after reading file 
    int noOfCustomers;
    FileReadCSV bmiFile;

    public Concert()
    {
        bmiFile = new FileReadCSV();
    }
    //top level algorithm
    public void processCustomer() throws IOException
    {
        countOKTicket();
    }

    public void setUpCustomerList() throws IOException
    {
        System.out.println("ChoralShield concert: Customer Ticket update");
        System.out.println("** Preparing to read data file.");
        //read file, fetch data as string array containing the rows
        String[] dataRows = bmiFile.readCSVtable();
        //calculate the number of cUSTOMER ROWS 
        //update user with number of rows with membership details
        System.out.println("**" +" rows read.\n\n");
        //prepare array for customers 
    }

    public void countOKTicket()
    {
        //placeholder, add detail later
    }
}