package lab05.quanlysach.validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lab05.quanlysach.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUserNameValidator implements ConstraintValidator<ValidUsername,String>
{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        if(userRepository==null)
            return true;
        return userRepository.findByUsername(username)==null;
    }
}
