package es.danirod.turbo;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author danirod
 */
public class TurboBuildTest {

    @Test
    public void testBuildProperties() {
        assertNotNull(TurboBuild.VERSION);
        assertNotNull(TurboBuild.DATE);
    }

}
