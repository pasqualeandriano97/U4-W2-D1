package exepitions;

import es3.Contocorrente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BancaException extends Exception {
private static Logger logger = LoggerFactory.getLogger(BancaException.class);
    public BancaException(String message) {

        logger.error(message);
}
}
