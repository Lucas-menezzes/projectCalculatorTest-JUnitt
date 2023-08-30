package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();
    //Valida a soma
    @Test
    public void sum() {
        assertEquals(5, calc.somar(2, 3));

    }
    //Valida a multiplicação
    @Test
    public void multiplication() {
        assertEquals(6, calc.mutiply(2, 3));
        
    }
    //Valida o erro da mutiplicação
    @Test
    public void multiplicationErro() {
        assertNotEquals(5, calc.mutiply(2, 3));
        
    }
}
