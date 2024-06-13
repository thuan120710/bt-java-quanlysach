package lab05.quanlysach.validator;


import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lab05.quanlysach.entity.Category;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category>
{
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext)
    {
        return category!=null && category.getId() != null;
    }
}
