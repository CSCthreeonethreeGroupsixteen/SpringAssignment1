package com.javaguides.SpringAssignment1;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class CourseNameValidator implements ConstraintValidator<ValidCourseName, String> {

    private final List<String> validNames = Arrays.asList(
            "CSC 313", "CSC 211", "CSC 312", "CSC 223", "CSC 324",
            "CSC 113F", "CSC 123F", "CSC 512", "CSC 513", "CSC 515", "CSC 501"
    );

    @Override
    public void initialize(ValidCourseName constraintAnnotation) {}

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return name != null && validNames.contains(name);
    }
}
