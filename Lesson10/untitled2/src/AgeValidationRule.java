// Дополните класс для проверки возраста пользователя
public class AgeValidationRule extends ValidationRule{
    private byte value;
    public AgeValidationRule(byte age){
        super(age,"Возраст для подачи на ипотеку должен быть старше 18 лет");
        this.value = age;
    }

    @Override
    public boolean isValid(){
        return  (value >= 18);

    }

}