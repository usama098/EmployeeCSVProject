package model.validate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeIDTest {

    @DisplayName("Enter valid 6 digit employee number")
    @Test
    void validateData() {
        assertEquals(true, EmployeeID.validateData("123456"));
    }
    @DisplayName("Enter valid 7 digit employee number")
    @Test
    void invalidateData() {
        assertEquals(false, EmployeeID.validateData("1234567"));
    }
    @DisplayName("Enter invalid data with alphabets")
    @Test
    void invalidateDataWithCharacters() {
        assertEquals(false, EmployeeID.validateData("abcd567"));
    }

}