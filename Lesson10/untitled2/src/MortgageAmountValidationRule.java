
// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule{
    private int value, min = 1000000, max = 10000000;
    public MortgageAmountValidationRule(Integer value){
        super(value,"Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
        this.value = value;
    }


// Объявите и реализуйте метод для проверки суммы ипотеки ниже
    @Override
    public boolean isValid() {
        if(value >= min && value <= max)
            return true;
        else
            return false;
    }

}