package model.validate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeIDTest {

    @DisplayName("Enter valid 6 digit employee number")
    @Test
    void validateData() {
        boolean actual = EmployeeID.validateData("123456");


    }

}