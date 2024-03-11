package exepitions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidLiterNumber extends Exception {
    private static Logger logger = LoggerFactory.getLogger(InvalidLiterNumber.class);
    public InvalidLiterNumber(int number) {
        logger.error("Il numero inserito non è valido: " + number);
    }
}
