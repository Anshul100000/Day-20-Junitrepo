package com.bridgelab;

public class Moodanalysertest {
    @Test
    public void validateEmail() {
        assertEquals(expected, FieldValidationController.getInstance().validateEmailAddress(emailAddress));
    }
}
