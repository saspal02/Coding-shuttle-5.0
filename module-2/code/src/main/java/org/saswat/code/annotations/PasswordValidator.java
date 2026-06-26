package org.saswat.code.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<PasswordValidation, String> {

    @Override
    public boolean isValid(
            String password,
            ConstraintValidatorContext context) {

        if(password == null)
            return false;

        return password.matches(
                "^(?=.*[a-z])" +
                        "(?=.*[A-Z])" +
                        "(?=.*[@#$%^&+=!])" +
                        ".{10,}$");
    }

}