import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;


class CalculatorTest {

    @Test
    void shouldReturnCorrectValueForUSDCurrency()
    {
        Calculator calculator = new Calculator(prepareData());
        double actualValue = calculator.calculate(10, "USD");
        double expectedValue = Math.round(1.2198 * 10 * 100.0) / 100.0;
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    void shouldReturnCorrectValueForPLNCurrency()
    {
        Calculator calculator = new Calculator(prepareData());
        double actualValue = calculator.calculate(10, "PLN");
        double expectedValue = Math.round(4.4837 * 10 * 100.0) / 100.0;
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    void shouldThrowExceptionWhenBadCurrencyName()
    {
        Calculator calculator = new Calculator(prepareData());
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(10, "FOIT"));
    }

    private Map<String, Double> prepareData(){
        HashMap<String, Double> map = new HashMap<>();
        map.put("USD", 1.2198);
        map.put("PLN", 4.4837);
        return map;
    }
}
