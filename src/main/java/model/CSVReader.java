package model;

import util.LoggingClass;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public abstract class CSVReader {
    private static ArrayList<String> readArray = null;

    public static ArrayList<String> getReadArray() {
        return readArray;
    }

    public void setReadArray(ArrayList<String> readArray) {
        this.readArray = readArray;
    }
    public static ArrayList<String> readInFile(String fileName){
        BufferedReader reader = null;
        String line = "";
        try{
            reader = new BufferedReader(new FileReader(fileName));
            readArray = new ArrayList<String>();
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");

                //start validating data from the row string array
                //call the constructor here to create an employee class instance
                //edit three arraylists: 1 employee arraylist<data is all fine>, dublicates<dublicated id of employee> 3. corrupted data<>
                readArray.add(line);
            }

        }catch (Exception e){
            LoggingClass.traceLog("employees.csv file read");
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return readArray;
    }
}
