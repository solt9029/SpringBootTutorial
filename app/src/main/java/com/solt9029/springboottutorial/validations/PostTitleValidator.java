package com.solt9029.springboottutorial.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostTitleValidator implements ConstraintValidator<PostTitle, String> {
    @Override
    public void initialize(PostTitle name) {

    }

    @Override
    public boolean isValid(String input, ConstraintValidatorContext context) {
        if (input == null) {
            return false;
        }

        return input.length() > 0;
    }
}
