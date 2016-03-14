public class Customer
{
    // list of properties
    private String fName;
    private String sName;
    private String CustomerID;
    private String TicketID;
    private char NumOfTickets;
    private String MethOfPurchase; 
    // instance variables - replace the example below with your own
    public Customer()
    {
        // initialise instance variables
        fName = "";
        sName = "";
        CustomerID = "";
        TicketID = "";
        NumOfTickets = 0;
        MethOfPurchase = "";
    }

    public void readCustomerDetails (String dataItems)
    {
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");

        // store each data item as instance property
        fName = rowItems[0];
        sName = rowItems[1];
        CustomerID = rowItems[2];
        TicketID = rowItems[3];
        NumOfTickets = (rowItems[4]).charAt(0);
        MethOfPurchase = rowItems[5];
    }

    public String writeDetails()
    {
        // join up data into a strinbg to output as a row
        // use "," to seperate csv columns 
        String CustomerData = "";
        CustomerData = CustomerData.concat(fName);
        CustomerData = CustomerData.concat(",");
        CustomerData = CustomerData.concat(sName);
        CustomerData = CustomerData.concat(",");
        return CustomerData;
    }

    public String getNight()
    {
        return TicketID;
    }

    public int getNumOFTickets()
    {
        return NumOfTickets;
    }

    public String getMethOfPurchase()
    { return MethOfPurchase;
    }

}
