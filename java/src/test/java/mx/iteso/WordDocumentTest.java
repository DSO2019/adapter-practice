package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import mx.iteso.WordDocument;
import mx.iteso.beans.Format;
import mx.iteso.beans.Image;
import mx.iteso.beans.MSLicense;

/** Word Document Test Class. */
public class WordDocumentTest {

    /** Word document. */
    private WordDocument wordDocument = new WordDocument(10001);

    /** Font evaluator. */
    @Test
    public void testFormat() {
        wordDocument.setFormat(new Format());
        assertEquals("Roboto",wordDocument.getFormat().getFont().getFontName());
    }

    /** Background test. */
    @Test
    public void testgetBackground() {
        wordDocument.setBackground(new Image("image.png"));
        assertEquals("image.png",wordDocument.getBackground().getUrl());
    }

    /** Set sharing permission test. */
    @Test
    public void testMSOfficeVersion() {
        wordDocument.setMSOfficeVersion(2.1f);
        assertEquals("2.1",Float.toString(wordDocument.getMSOfficeVersion()));
    }

    /** License test. */
    @Test
    public void testLicense() {
        wordDocument.setLicense(new MSLicense(10001));
        assertEquals(10001, wordDocument.getLicense().getNumber());
    }

    /** License test. */
    @Test
    public void testRestrictedEdit() {
        assertFalse(
            wordDocument.restrictEditIfLicenseIsInvalid(new MSLicense(10001)));
    }

}
