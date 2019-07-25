package com.solt9029.springboottutorial.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PostTitleValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface PostTitle {
    String message() default "not empty";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
