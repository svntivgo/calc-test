package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long suma(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mult(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long divi(Long number1, Long number2) {
        logger.info( "Summing {} / {}", number1, number2 );
        return number1 / number2;
    }
}
