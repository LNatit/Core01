package lnatit.core01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final boolean SHOW_LOG = Config.SHOW_LOG.get();
    public static final boolean SHOW_WARN = SHOW_LOG & Config.SHOW_WARN.get();

    public static void warn(String str)
    {
        if (SHOW_WARN)
            LOGGER.warn(str);
    }

    public static void warn(String str, Object... args)
    {
        if (SHOW_WARN)
            LOGGER.warn(String.format(str, args));
    }

    public static void info(String str)
    {
        if (SHOW_LOG)
            LOGGER.info(str);
    }

    public static void info(String str, Object... args)
    {
        if (SHOW_LOG)
            LOGGER.info(String.format(str, args));
    }
}
