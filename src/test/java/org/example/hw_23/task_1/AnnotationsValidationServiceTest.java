package org.example.hw_23.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Pavel Radkevich
 * @since 20.04.23
 */
class AnnotationsValidationServiceTest {

    AnnotationsValidationService target = new AnnotationsValidationService();

    @Test
    void shouldNotThrowException_whenObjectIsValid() {
        // given
        AccountInformation validInformation = new AccountInformation("Pavel", "Pav", "prv@mai.com", "878687687678");

        // when
        assertDoesNotThrow(() -> target.validate(validInformation));

        // then
    }

    @Test
    void shouldThrowValidationException_whenNameInvalid() {
        // given
        AccountInformation invalidNameInfo = new AccountInformation("pav123", "Pav", "prv@mai.com", "878687687678");
        String expectedMessage = "Field 'name' with value 'pav123' can contain only letters";

        // when
        ValidationException validationException = assertThrows(ValidationException.class, () -> target.validate(invalidNameInfo));

        // then
        String actualMessage = validationException.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void shouldThrowException_whenEmailInvalid() {
        //given
        AccountInformation invalidEmailInfo = new AccountInformation("Pavel", "Pav", "prv@com", "878687687678");
        String expectedMessage = "Field 'email' with value 'prv@com' must contains '@' and '.'";

        //when
        ValidationException validationException = assertThrows(ValidationException.class, () -> target.validate(invalidEmailInfo));

        //then
        String actualMessage = validationException.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void shouldThrowException_whenPhoneNumberInvalid() {
        //given
        AccountInformation invalidPhoneInfo = new AccountInformation("Pavel", "Pav", "prv@mai.com", "8786o7687678");
        String expectedMessage = "Field 'phoneNumber' with value '8786o7687678' can contains only digits";

        //when
        ValidationException validationException = assertThrows(ValidationException.class, () -> target.validate(invalidPhoneInfo));

        //then
        String actualMessage = validationException.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}
