package mx.iteso.adapter;

import static org.junit.Before;
import static org.junit.Test;
import static org.junit.Assert.assertEquals;


import mx.iteso.adapter.impl.other.MSLicense;

/**
 * MSLicense test class.
 */
public class MSLicenseTest {
    /**
     * Validation boolean.
     */
    private MSLicense license;
    /**
     * Set up method.
     */
    @Before
    public void SetUp() {
        license = new MSLicense();
    }
    /**
     * Validation test.
     */
    @Test
    public void validationTest() {
        assertEquals(true, license.isValid());
    }

}
