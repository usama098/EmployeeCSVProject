package model.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAddressTest {

    @Test
    @DisplayName("Enter valid email address format")
    void rightValidatedData() {
        assertEquals(true, EmailAddress.validateData("usama.navid@gmail.com"));
    }

    @DisplayName("Enter wrong email format without @")
    @Test
    void wrongValidatedData() {
        assertEquals(false, EmailAddress.validateData("usama.navidgmail.com"));
    }

    @DisplayName("Enter wrong email format without @ & .")
    @Test
    void wrongValidatedDataTwo() {
        EmailAddress emailAddress = new EmailAddress();
        assertEquals(false, emailAddress.validateData("usama.navidgmailcom"));
    }
}