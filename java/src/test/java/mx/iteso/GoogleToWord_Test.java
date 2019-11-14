package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Google To Word Test Class.
 */
public class GoogleToWord_Test {

    /**
     * Original Google document.
     */
    private GoogleDoc googleDoc = new GoogleDoc();
    private GoogleToWord googleToWordAdapter = new GoogleToWord(googleDoc);

    /**
     * Background test.
     */
    @Test
    public void testgetBackground() {
        assertEquals("image.png", googleToWordAdapter.getBackground().getUrl());
    }


    /**
     * License test.
     */
    @Test
    public void testLicense() {
        assertEquals(2000, googleToWordAdapter.getMSLicense().getLicenseNumber());
    }

    /**
     * License test.
     */
    @Test
    public void testRestrictedEdit() {
        assertFalse(
                googleToWordAdapter.restricInvalidLicense(new MSLicense(2000)));
    }

    /**
     * Font evaluator.
     */
    @Test
    public void testFormat() {
        assertEquals("Roboto", googleToWordAdapter.getFormat().getFont().getFontName());
    }



}
