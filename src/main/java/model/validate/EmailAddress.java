package model.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
    private Pattern regexPattern;
    private Matcher regMatcher;
    public boolean validateData(String emailAddress){
        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(emailAddress);
        if(regMatcher.matches()){
            return true;
        }else{
            return false;
        }
    }
    public static String convertData(String emailAddress) {
        return emailAddress;
    }
}
