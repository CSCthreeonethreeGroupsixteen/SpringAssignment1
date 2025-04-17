package com.javaguides.SpringAssignment1;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CategoryValidator.class)
public @interface ValidCategory {


    String message() default "Invalid category. Allowed categories are: UNDERGRADUATE,FOUNDATION, HONORS";


    Class<?>[] groups() default {};


    Class<? extends Payload>[] payload() default {};
}
