package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import mx.iteso.adapter.GoogleToWord;
import mx.iteso.beans.MSLicense;

/** Google To Word Test Class. */
public class GoogleToWordTest {

    /** Original Google document. */
    private GoogleDoc googleDoc = new GoogleDoc();
    private GoogleToWord googleToWordAdapter = new GoogleToWord(googleDoc);

    /** Font evaluator. */
    @Test
    public void testFormat() {
        assertEquals("Roboto",googleToWordAdapter.getFormat().getFont().getFontName());
    }

    /** Background test. */
    @Test
    public void testgetBackground() {
        assertEquals("image.png",googleToWordAdapter.getBackground().getUrl());
    }


    /** License test. */
    @Test
    public void testLicense() {
        assertEquals(10001, googleToWordAdapter.getLicense().getNumber());
    }

    /** License test. */
    @Test
    public void testRestrictedEdit() {
        assertFalse(
            googleToWordAdapter.restrictEditIfLicenseIsInvalid(new MSLicense(10001)));
    }

}
