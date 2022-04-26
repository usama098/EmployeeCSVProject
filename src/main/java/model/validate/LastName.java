package model.validate;

public class LastName {
        public boolean validateData(String lastName){
            if(lastName.matches( "[A-Z][a-z]*" )){
                return true;
            } else{
                return false;
            }
        }
}
