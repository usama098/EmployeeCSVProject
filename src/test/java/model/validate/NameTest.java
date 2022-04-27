package model.validate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// complete this after csvreader is done
class NameTest {
    @Test
    @DisplayName("Enter valid email address format")
    void rightValidatedData() {
        assertEquals(true, Name.validateData("Usama Navid"));
    }
}