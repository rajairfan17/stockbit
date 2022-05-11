package id.stockbit.helper;

import id.stockbit.core.variables.GenericVariables;
import org.openqa.selenium.Keys;

import java.util.logging.Logger;

public class SeleniumHelper implements GenericVariables {
    // Logger
    protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void writeLog(String message) {
        LOGGER.info(message);
    }
}
