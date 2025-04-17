package com.javaguides.SpringAssignment1;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CourseNameValidator.class)
public @interface ValidCourseName {
    String message() default "Invalid course name. Allowed names are: CSC 313, CSC 211,CSC 312,CSC 223,CSC 324, CSC 113F,CSC 123F,CSC 512,CSC 513,CSC 515,CSC 501";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
