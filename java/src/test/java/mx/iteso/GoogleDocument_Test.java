package mx.iteso;

import static org.junit.Assert.assertEquals;

import java.awt.Font;

import org.junit.Test;

/**
 * Google Document Test Class.
 */
public class GoogleDocument_Test {

    /**
     * Google document.
     */
    private GoogleDoc googleDoc = new GoogleDoc();

    /**
     * Style evaluator.
     */
    @Test
    public void testGetStyle() {
        Format style = googleDoc.getStyle();
        assertEquals("Roboto", style.getFont().getName());
    }

    /**
     * Background test.
     */
    @Test
    public void testgetBackground() {
        BackgrdImage bg = googleDoc.getBackground();
        assertEquals("image.png", bg.getImage().getUrl());
    }

    /**
     * Set sharing permission test.
     */
    @Test
    public void testsetSharingPermissions() {
        googleDoc.setLicensePermissions(0);
        assertEquals(0, googleDoc.getLicensePermissions());
    }

    /**
     * Font evaluator.
     */
    @Test
    public void testGetFont() {
        Font font = googleDoc.getFont();
        assertEquals("Roboto", font.getFontName());
    }


}
