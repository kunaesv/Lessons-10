// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule extends ValidationRule{
    private boolean value;
    public EmploymentValidationRule(Boolean value){
        super(value,"Ипотека выдается только трудоустроенным");
        this.value = value;
    }

    @Override
    public boolean isValid(){
        return value;
    }
}