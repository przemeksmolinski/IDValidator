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
    public void testIsCorrectIdValidatesTrue(){
        Assert.assertTrue(polishIdValidator.validate("WZM123456"));
    }

    @Test
    public void testIsEmptyIdFalse(){
        Assert.assertFalse(polishIdValidator.validate(""));
    }

    @Test
    public void testIsMixIdValidateFalse(){
        Assert.assertFalse(polishIdValidator.validate("123ACV456"));
    }

    @Test
    public void testTooShortIdValidateFalse(){
        Assert.assertFalse(polishIdValidator.validate("A1"));
    }
    @Test
    public void testValidate(){
        Assert.assertTrue(polishIdValidator.validate("ATM930408"));
    }

}
