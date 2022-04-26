package model.validate;

public class FirstName implements ValidateData{
    //173003,Mrs.,Willia,Q,Weigand,F,willia.weigand@gmail.com,10/20/1960,7/30/2005,158292
    public static boolean validateData (String firstName){
        if(firstName.matches( "[A-Z][a-z]*" )){
            return true;
        } else{
            return false;
        }
    }
    public static String convertData(String firstName) {
        return firstName;
    }

}
