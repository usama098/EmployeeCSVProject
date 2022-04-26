package model.validate;

import java.util.regex.Pattern;

public abstract class Salary implements ValidateData {
    private final Pattern salaryPattern = Pattern.compile("\\d+");
    public boolean validateData(String salary){
        if (salary == null) {
            return false;
        }

        return salaryPattern.matcher(salary).matches();
    }

    public static int convertData(String salary) {
        return Integer.parseInt(salary);
    }
}
