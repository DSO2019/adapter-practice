package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Word Document Test Class.
 */
public class WordDocument_Test {

    /**
     * Word document.
     */
    private WordDocument wordDocument = new WordDocument(2000);

    /**
     * Set sharing permission test.
     */
    @Test
    public void testMSOfficeVersion() {
        wordDocument.setMSOffice(2.1f);
        assertEquals("2.1", Float.toString(wordDocument.getMSOffice()));
    }

    /**
     * License test.
     */
    @Test
    public void testLicense() {
        wordDocument.setMSLicense(new MSLicense(2000));
        assertEquals(2000, wordDocument.getMSLicense().getLicenseNumber());
    }

    /**
     * License test.
     */
    @Test
    public void testRestrictedEdit() {
        assertFalse(
                wordDocument.restricInvalidLicense(new MSLicense(2000)));
    }

    /**
     * Font evaluator.
     */
    @Test
    public void testFormat() {
        wordDocument.setFormat(new Format());
        assertEquals("Roboto", wordDocument.getFormat().getFont().getFontName());
    }

    /**
     * Background test.
     */
    @Test
    public void testgetBackground() {
        wordDocument.setBackground(new Image("image.png"));
        assertEquals("image.png", wordDocument.getBackground().getUrl());
    }



}
