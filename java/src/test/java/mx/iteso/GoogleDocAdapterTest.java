package mx.iteso;

import mx.iteso.adapter.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoogleDocAdapterTest {
    GoogleAdapter googleDocAdapter;
    GoogleDoc mockedGoogleDoc;

    @Before
    public void setUp(){
        mockedGoogleDoc = new GoogleDoc(new Font("Arial"), new BackgroundImage(new Image("imageUrl")),new Format(new Font("Arial"), "Regular"),1);
        googleDocAdapter = new GoogleAdapter(mockedGoogleDoc);
    }

    @Test
    public void getFormatTest() {
        String result = googleDocAdapter.getFormat().getFont();
        Assert.assertEquals("Arial", result);
    }

    @Test
    public void getBackgroundTest() {
        String result = googleDocAdapter.getBackground().getUrl();
        Assert.assertEquals("imageUrl", result);

    }

    @Test
    public void setMSOfficeVersionTest() {
        googleDocAdapter.setMSOfficeVersion(3);
        Assert.assertEquals(3, googleDocAdapter.getMSOfficeVersion(), 0);
    }

    @Test
    public void getLicenseTest() {
        String result = googleDocAdapter.getLicense().getLicense();
        Assert.assertEquals("Google license", result);
    }

    @Test
    public void restrictEditIfLicenseIsInvalidTestFalse() {
        MSLicense ms = new MSLicense("Ms");
        boolean result = googleDocAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(false, result);

    }
    @Test
    public void restrictEditIfLicenseIsInvalidTestTrue() {
        MSLicense ms = new MSLicense("Google license");
        boolean result = googleDocAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(true, result);
    }
}
