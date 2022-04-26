package model.validate;

import java.util.regex.Pattern;

public abstract class Salary implements ValidateData {

    public static boolean validateData(String salary){
        Pattern salaryPattern = Pattern.compile("\\d+");
        if (salary == null) {
            return false;
        }

        return salaryPattern.matcher(salary).matches();
    }

    public static int convertData(String salary) {
        return Integer.parseInt(salary);
    }
}
