package model.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiddleInitial {
    public boolean validateData(String gender){
        String regex = "[A-Z]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(gender);
        if(m.matches()){
            return true;
        } else{
            return false;
        }
    }
}
