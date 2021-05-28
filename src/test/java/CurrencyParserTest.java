import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyParserTest {

    @Test
    void shouldReturnCorrectAmountOfCurrencies()
    {
        Map<String, Double> currencyMap = CurrencyParser.parse();
        int actualAmountOfCurrencies = currencyMap.size();
        int expectedAmountOfCurrencies = 32;
        Assertions.assertEquals(expectedAmountOfCurrencies, actualAmountOfCurrencies);
    }
    @Test
    void shouldReturnCorrectRateForUSDCurrency()
    {
        Map<String, Double> currencyMap = CurrencyParser.parse();
        Double actualCurrencyValue = currencyMap.get("USD");
        Assertions.assertEquals(1.2198, actualCurrencyValue);
    }
}
