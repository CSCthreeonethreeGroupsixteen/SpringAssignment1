package com.javaguides.SpringAssignment1;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;


public class CategoryValidator implements ConstraintValidator<ValidCategory, String> {

    private final List<String> validCategories = Arrays.asList("UNDERGRADUATE", "FOUNDATION", "HONORS");

    @Override
    public void initialize(ValidCategory constraintAnnotation) {

    }

    @Override
    public boolean isValid(String category, ConstraintValidatorContext context) {
        if (category == null || category.isEmpty()) {
            return false;
        }
        return validCategories.contains(category);
    }
}
