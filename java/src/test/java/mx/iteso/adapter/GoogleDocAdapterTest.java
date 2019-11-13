package mx.iteso.adapter;

import mx.iteso.adapter.googledoc.GoogleDoc;
import mx.iteso.adapter.googledoc.GoogleDocAdapter;
import mx.iteso.adapter.word.MSLicense;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleDocAdapterTest {
    private GoogleDocAdapter gAdapter;
    @Before
    public void init() {
        gAdapter = new GoogleDocAdapter(new GoogleDoc());
    }
    @Test
    public void backgroundTest() {
        Image gAdapterBackground = gAdapter.getBackground();
        assertEquals(400.0, gAdapterBackground.getWidth(), 0.0);
        assertEquals(600.0, gAdapterBackground.getHeight(), 0.0);
    }
    @Test
    public void licenseTest() {
        MSLicense gAdapterLicense = gAdapter.getLicense();
        assertEquals(2.0, gAdapterLicense.getLicenseVersion(), 0.0);
        assertTrue(gAdapter.restrictEditIfLicenseIsInvalid());
    }
    @Test
    public void formatTest() {
        Format gAdapterFomart = gAdapter.getFormat();
        assertEquals("TimesNewRoman", gAdapterFomart.getFont().getFontName());
        assertEquals(25, gAdapterFomart.getFont().getFontSize());

    }
}
