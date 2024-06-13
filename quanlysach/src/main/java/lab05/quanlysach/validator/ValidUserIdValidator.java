package lab05.quanlysach.validator;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lab05.quanlysach.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,Long> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(Long userid, ConstraintValidatorContext constraintValidatorContext) {
        if(userRepository==null)
            return true;
        return userRepository.findByUserId(userid)==null;
    }
}
