package mx.iteso.adapter;

import mx.iteso.adapter.impl.other.Image;
import mx.iteso.adapter.impl.document.WordDoc;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.MSLicense;
import static org.junit.Assert.assertEquals;
import static org.junit.Test;
import static org.junit.Before;
/**
 * Word documents test class.
 */
public class WordDocTest {
    /**
     * Word document.
     */
    private WordDoc wd;
    /**
     * Set up method.
     */
    @Before
    public void SetUp() {
        wd = new WordDoc();
    }
    /**
     * Format test.
     */
    @Test
    public void formatTest() {
        Object format = new Object();
        asssertEquals(true, format.equals(wd.getFormat()));
    }
    /**
     * Background test.
     */
    @Test
    public void backgroundTest() {
        Image background = new Image();
        assertEquals(true, background.equals(wd.getBackground()));
    }
    /**
     * Set office version test.
     */
    @Test
    public void setVersionTest() {
        float officeVersion = 10;
        assertEquals("New office version is 10", wd.setMSOfficeVersion(officeVersion));
    }
    /**
     * Get license test.
     */
    @Test
    public void getLicenseTest() {
        MSLicense license = new MSLicense();
        assertEquals(true, license.equals(wd.getLicense()));
    }
    /**
     * restrict Edit test.
     */
    @Test
    public void restrictTest() {
        MSLicense license = new MSLicense();
        assertEquals(true, wd.restrictEditIfLicenseIsInvalid(license));
    }
}