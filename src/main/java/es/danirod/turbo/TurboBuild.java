package es.danirod.turbo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Contains build information provided by the building system.
 *
 * @author danirod
 * @version 0.1.0
 */
public class TurboBuild {

    /** The library version. */
    public static final String VERSION;

    /** The date the library was built on. */
    public static final String DATE;

    /** Is debug mode enabled or not. */
    public static final boolean DEBUG;

    static {
        // Try to load the resources file.
        Properties buildProperties = loadBuildProperties();
        VERSION = buildProperties.getProperty("build.version");
        DATE = buildProperties.getProperty("build.date");
        DEBUG = Boolean.parseBoolean(buildProperties.getProperty("debug.on"));
    }

    /**
     * This function will attempt to load the build properties provided by the
     * building system. This file is expected to be located in the main
     * resources folder using the name build.properties.
     *
     * <p>If the file is found, it will be read and the Properties inside the
     * file will be returned as a Properties object. If the file is not found,
     * an AssertionError will be thrown.</p>
     *
     * @return  Properties file containing the properties found
     */
    private static Properties loadBuildProperties() {
        Properties props = new Properties();
        InputStream readStream = null;

        try {
            readStream = TurboBuild.class.getClassLoader().getResourceAsStream("build.properties");
            props.load(readStream);
        } catch (Exception e) {
            throw new AssertionError("Build properties not present.");
        } finally {
            if (readStream != null)
                try {
                    readStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return props;
    }

}
