package model;

import model.validate.*;
import util.LoggingClass;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    private static ArrayList<String> readArray = null;

    public static ArrayList<String> getReadArray() {
        return readArray;
    }

    public void setReadArray(ArrayList<String> readArray) {
        this.readArray = readArray;
    }

    public static EmployeeList readInFile(String fileName){
        EmployeeList empList = new EmployeeList();

        BufferedReader reader = null;
        String line;

        try{
            reader = new BufferedReader(new FileReader(fileName));

            while((line = reader.readLine()) != null){
                // 173003,Mrs.,Willia,Q,Weigand,F,willia.weigand@gmail.com,10/20/1960,7/30/2005,158292,
                //   0      1    2    3   4     5       6                       7           8       9
                String[] columns = line.split(",");

                boolean isValid = true;
                for (int i=0 ; i<columns.length ; i++) {
                    if (isValid) {
                        switch (i) {
                            case 0:
                                if ( !EmployeeID.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 1:
                                if ( !Prefix.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 2:
                            case 4:
                                if ( !Name.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 3:
                                if (!MiddleInitial.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 5:
                                if ( !Gender.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 6:
                                if ( !EmailAddress.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 7:
                            case 8:
                                if ( !DateOf.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            case 9:
                                if ( !Salary.validateData(columns[i]) ) {
                                    isValid = false;
                                }
                                break;
                            default: isValid=false;
                        }
                    } else {
                        break;
                    }


                }

                //call the constructor here to create an employee class instance
                if (isValid) {
                    Employee employee = new Employee(
                            columns[0],
                            columns[1],
                            columns[2],
                            columns[3],
                            columns[4],
                            Gender.convertData(columns[5]),
                            columns[6],
                            DateOf.convertData(columns[7]),
                            DateOf.convertData(columns[8]),
                            Salary.convertData(columns[9]));


                    empList.addCleanEmployee(employee);
                } else {
                    CorruptedEmployee employee = new CorruptedEmployee(
                            columns[0],
                            columns[1],
                            columns[2],
                            columns[3],
                            columns[4],
                            columns[5],
                            columns[6],
                            columns[7],
                            columns[8],
                            columns[9]);

                    empList.addCorruptedEmployee(employee);
                }
            }

        }catch (IOException e){
            LoggingClass.traceLog("employees.csv file read");
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return empList;
    }
}
