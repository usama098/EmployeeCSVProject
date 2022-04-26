package model.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gender {
    public static boolean validateData(String gender){
        String regex = "M|F";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(gender);
        if(m.matches()){
            return true;
        } else{
            return false;
        }
    }
    public static String convertData(String gender) {
        return gender;
    }
}
