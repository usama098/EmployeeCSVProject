package model.validate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAddressTest {

    @DisplayName("Enter valid email address format")
    @Test
    void rightValidatedData() {
        EmailAddress emailAddress = new EmailAddress();
        assertEquals(true, emailAddress.validateData("usama.navid@gmail.com"));
    }

    @DisplayName("Enter wrong email format")
    @Test
    void wrongValidatedData() {
        EmailAddress emailAddress = new EmailAddress();
        assertEquals(false, emailAddress.validateData("usama.navidgmail.com"));
    }
}