package mx.iteso.adapter;

import mx.iteso.adapter.impl.other.Image;
import mx.iteso.adapter.impl.adapter.DocsAdapter;
import mx.iteso.adapter.impl.document.GoogleDoc;
import mx.iteso.adapter.impl.document.WordDoc;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.MSLicense;
import static org.junit.Assert.assertEquals;
import static org.junit.Test;
import static org.junit.Before;
/**
 * Word documents test class.
 */
public class GoogleAdapterTest {
    /**
     * Google document.
     */
    private GoogleDoc gd;
    /**
     * Google adapter.
     */
    private DocsAdapter ga;

    /**
     * Set up method.
     */
    @Before
    public void SetUp() {
        gd = new GoogleDoc();
        ga = new DocsAdapter(gd);
    }
    /**
     * Format test.
     */
    @Test
    public void formatTest() {
        Object format = new Object();
        asssertEquals(true, format.equals(ga.getFormat()));
    }
    /**
     * Background test.
     */
    @Test
    public void backgroundTest() {
        Image background = new Image();
        assertEquals(null, background.equals(ga.getBackground()));
    }
    /**
     * Set office version test.
     */
    @Test
    public void setVersionTest() {
        float officeVersion = 10;
        assertEquals("New office version is 10", ga.setMSOfficeVersion(officeVersion));
    }
    /**
     * Get license test.
     */
    @Test
    public void getLicenseTest() {
        MSLicense license = new MSLicense();
        assertEquals(null, license.equals(ga.getLicense()));
    }
    /**
     * restrict Edit test.
     */
    @Test
    public void restrictTest() {
        MSLicense license = new MSLicense();
        assertEquals(false, ga.restrictEditIfLicenseIsInvalid(license));
    }
}
