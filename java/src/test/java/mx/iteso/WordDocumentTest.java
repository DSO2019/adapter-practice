package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import mx.iteso.utils.BackgroundImage;

import java.awt.Font;

public class WordDocumentTest {

    private WordDocument wordDocument = new WordDocument(1);

    @Test
    public void testGetFormat() {
        assertEquals(new Font("Calibri", Font.ITALIC, 12), this.wordDocument.getFormat().getFont());
    }

    @Test
    public void testGetBackground() {
        assertEquals(new BackgroundImage().getImage().getUrl(), this.wordDocument.getBackground().getUrl());
    }


    @Test
    public void testGetMsOfficeVersion() {
        this.wordDocument.setMSOfficeVersion(2.0f);
        assertEquals("2.0", Float.toString(this.wordDocument.getMsOfficeVersion()));
    }

    @Test
    public void testGetLicense() {
        assertEquals(1, this.wordDocument.getLicense().getLicenseNumber());
    }

    @Test
    public void testLicenseIsInvalid() {
        assertFalse(this.wordDocument.restrictEditIfLicenseIsInvalid(this.wordDocument.getLicense()));
    }

}