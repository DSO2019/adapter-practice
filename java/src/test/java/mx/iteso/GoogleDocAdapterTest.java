package mx.iteso;

import mx.iteso.adapter.*;
import mx.iteso.adapter.GoogleAdapter;
import mx.iteso.adapter.GoogleDoc;

import org.junit.*;

public class GoogleDocAdapterTest {
    GoogleAdapter googleAdapter;
    GoogleDoc mockedGoogleDoc;

    @Before
    public void setUp(){
        mockedGoogleDoc = new GoogleDoc();
        googleAdapter = new GoogleAdapter(mockedGoogleDoc);
    }

    @Test
    public void getFormatTest() {
        String result = googleAdapter.getFormat().getFont();
        Assert.assertEquals("Calibri", result);
    }

    @Test
    public void getBackgroundTest() {
        String result = googleAdapter.getBackground().getUrl();
        Assert.assertEquals("imageUrl", result);

    }

    @Test
    public void setMSOfficeVersionTest() {
        googleAdapter.setMSOfficeVersion(3);
        Assert.assertEquals(3, googleAdapter.getMSOfficeVersion(), 0);
    }

    @Test
    public void getLicenseTest() {
        String result = googleAdapter.getLicense().getLicense();
        Assert.assertEquals("Google license", result);
    }

    @Test
    public void restrictEditIfLicenseIsInvalidTestFalse() {
        MSLicense ms = new MSLicense("Ms");
        boolean result = googleAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(false, result);

    }
	
    @Test
    public void restrictEditIfLicenseIsInvalidTestTrue() {
        MSLicense ms = new MSLicense("Google license");
        boolean result = googleAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(true, result);

    }
}
