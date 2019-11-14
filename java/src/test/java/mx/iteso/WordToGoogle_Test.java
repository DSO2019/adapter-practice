package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Word To Google Test Class.
 */
public class WordToGoogle_Test {

    /**
     * Google document.
     */
    private WordDocument wordDocument = new WordDocument(2000);
    private WordToGoogle wordToGoogleAdapter = new WordToGoogle(wordDocument);

    /**
     * Background test.
     */
    @Test
    public void testGetBackground() {
        assertEquals("image.png", wordToGoogleAdapter.getBackground().getImage().getUrl());
    }

    /**
     * Set sharing permission test.
     */
    @Test
    public void testSetSharingPermissions() {
        assertEquals(1, wordToGoogleAdapter.getLicensePermissions());
    }

    /**
     * Font evaluator.
     */
    @Test
    public void testGetFont() {
        assertEquals("Roboto", wordToGoogleAdapter.getFont().getFontName());
    }

    /**
     * Style evaluator.
     */
    @Test
    public void testGetStyle() {
        assertEquals("Roboto", wordToGoogleAdapter.getStyle().getFont().getName());
    }


}
