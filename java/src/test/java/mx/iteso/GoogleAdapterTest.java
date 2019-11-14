package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import mx.iteso.GoogleAdapter;
import mx.iteso.IWordDocument;
import mx.iteso.utils.BackgroundImage;

import java.awt.Font;

public class GoogleAdapterTest {

    private GoogleDocument googleDocument = new GoogleDocument();
    private IWordDocument newWordDocument = new GoogleAdapter(googleDocument);

    @Test
    public void testGetFormat() {
        assertEquals(new Font("Calibri", Font.ITALIC, 12), this.newWordDocument.getFormat().getFont());
    }

    @Test
    public void testGetBackground() {
        assertEquals(new BackgroundImage().getImage().getUrl(), this.newWordDocument.getBackground().getUrl());
    }

    @Test
    public void testGetLicense() {
        assertEquals(1, this.newWordDocument.getLicense().getLicenseNumber());
    }

    @Test
    public void testLicenseIsInvalid() {
        assertFalse(this.newWordDocument.restrictEditIfLicenseIsInvalid());
    }

}