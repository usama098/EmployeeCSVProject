package model.validate;

public class LastName{
    public static boolean validateData(String lastName){
        if(lastName.matches( "[A-Z][a-z]*" )){
            return true;
        } else{
            return false;
        }
    }
    public static String convertData(String lastName) {
        return lastName;
    }
}
