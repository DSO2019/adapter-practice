package mx.iteso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mx.iteso.adapter.WordToGoogle;

/** Word To Google Test Class. */
public class WordToGoogleTest {

    /** Google document. */
    private WordDocument wordDocument = new WordDocument(10001);
    private WordToGoogle wordToGoogleAdapter = new WordToGoogle(wordDocument);

    /** Font evaluator. */
    @Test
    public void testGetFont() {
        assertEquals("Roboto",wordToGoogleAdapter.getFont().getFontName());
    }

    /** Style evaluator. */
    @Test
    public void testGetStyle() {
        assertEquals("Roboto",wordToGoogleAdapter.getStyle().getFont().getName());
    }

    /** Background test. */
    @Test
    public void testGetBackground() {
        assertEquals("image.png",wordToGoogleAdapter.getBackground().getImage().getUrl());
    }

    /** Set sharing permission test. */
    @Test
    public void testSetSharingPermissions() {
        assertEquals(1,wordToGoogleAdapter.getSharingPermissions());
    }
}
