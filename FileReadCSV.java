
import javax.swing.*;
import java.io.*;
public class FileReadCSV
{
    // instance variables - replace the example below with your own
    private FileReader fReader;
    public String[] readCSVtable() throws IOException {
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        int returnVal = fc.showOpenDialog(null);
        File csvFile = fc.getSelectedFile();
        
        char[] inBuffer = new char[5000];
