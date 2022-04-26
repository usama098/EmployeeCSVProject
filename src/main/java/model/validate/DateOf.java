package model.validate;


import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
    Input date format:      MM/dd/yyyy
        10/20/1960
        7/30/2005

    Output date format:     YYYY-MM-DD
        https://dev.mysql.com/doc/refman/8.0/en/datetime.html
 */

public abstract class DateOf implements ValidateData {
    public static boolean validateData(String dateOfBirth){
        boolean isValid;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date d = null;

        try {
            d = df.parse(dateOfBirth);
            isValid = true;
        } catch (ParseException  e) {
            e.printStackTrace();
            isValid = false;
        }

        return isValid;
    }

    public static Date convertData(String dateOfBirth) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = null;

        try {
            date = df.parse(dateOfBirth);

        } catch (ParseException  e) {
            e.printStackTrace();
        }

        assert date != null;
        return new Date(date.getTime());
    }
}
