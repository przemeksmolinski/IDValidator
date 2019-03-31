package Validator;

import java.util.Map;
import java.util.TreeMap;

public class PolishIdValidator implements Validator{

    static char letterValues[] =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                    'U', 'V', 'W', 'X', 'Y', 'Z'};

    int idElements[] = {7, 3, 1, 9, 7, 3, 1, 7, 3};

   // Map<String, Integer> mapValues = new TreeMap<>();


    @Override
    public boolean validate(String toValidate) {

        while(toValidate.matches("[A-Z]{3}[0-9]{6}")){
            for (int i = 0; i < idElements.length; i++) {

            }
            return true;

        }
        return false;
    }
}
