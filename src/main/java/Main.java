import Validator.PolishIdValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PolishIdValidator polishIdValidator = new PolishIdValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr dowodu: ");
        String input = scanner.next();
        System.out.println(polishIdValidator.validate(input));
    }
}
