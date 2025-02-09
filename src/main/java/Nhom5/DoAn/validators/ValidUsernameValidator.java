package Nhom5.DoAn.validators;
import Nhom5.DoAn.services.UserService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class ValidUsernameValidator implements
        ConstraintValidator<ValidUsername, String> {
    private final UserService userService;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext
            context) {
        return userService.findByUsername(username).isEmpty();
    }
}
