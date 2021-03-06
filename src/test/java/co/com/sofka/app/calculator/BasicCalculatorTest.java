package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing suma: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing resta: 4-2=2")
    public void resta() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "4,    2,   2",
            "6,    2,   4",
            "0,   3,   -3",
            "3,   3,    0"
    })
    public void severalSubtractions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing mult: 4/2=2")
    public void mult() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 8L;

        // Act
        Long result = basicCalculator.mult(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplicactions")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "4,    2,   8",
            "6,    2,   12",
            "9,    3,   27",
            "33,   3,   99"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mult(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divi: 4/2=2")
    public void divi() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.divi(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divs")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "4,    2,   2",
            "6,    2,   3",
            "90,   3,  30",
            "33,  11,   3"
    })
    public void severalDivs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divi(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}