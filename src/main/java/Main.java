import Validator.PolishIdValidator;

public class Main {
    public static void main(String[] args) {
        PolishIdValidator polishIdValidator = new PolishIdValidator();
        System.out.println(polishIdValidator.validate("ATM546370"));
    }
}
