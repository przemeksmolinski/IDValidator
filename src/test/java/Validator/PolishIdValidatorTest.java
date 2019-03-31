package Validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PolishIdValidatorTest {

    private PolishIdValidator polishIdValidator;

    @Before

    public void setUp() {
        polishIdValidator = new PolishIdValidator();
    }

    @Test
    public void validate(){
        Assert.assertTrue(polishIdValidator.validate("WZM123456"));
    }

    @Test
    public void isEmpty(){
        Assert.assertFalse(polishIdValidator.validate(""));
    }

    @Test
    public void mixValidate(){
        Assert.assertFalse(polishIdValidator.validate("123ACV456"));
    }

    @Test
    public void tooShortValidate(){
        Assert.assertFalse(polishIdValidator.validate("A1"));
    }

}
