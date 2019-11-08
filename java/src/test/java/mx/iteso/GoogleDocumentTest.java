package mx.iteso;

import static org.junit.Assert.assertEquals;

import java.awt.Font;

import org.junit.Test;

import mx.iteso.GoogleDoc;
import mx.iteso.beans.BackgroundImage;
import mx.iteso.beans.Format;

/** Google Document Test Class. */
public class GoogleDocumentTest {

    /** Google document. */
    private GoogleDoc googleDoc = new GoogleDoc();

    /** Font evaluator. */
    @Test
    public void testGetFont() {
        Font font = googleDoc.getFont();
        assertEquals("Roboto",font.getFontName());
    }

    /** Style evaluator. */
    @Test
    public void testGetStyle() {
        Format style = googleDoc.getStyle();
        assertEquals("Roboto",style.getFont().getName());
    }

    /** Background test. */
    @Test
    public void testgetBackground() {
        BackgroundImage bg = googleDoc.getBackground();
        assertEquals("image.png",bg.getImage().getUrl());
    }

    /** Set sharing permission test. */
    @Test
    public void testsetSharingPermissions() {
        googleDoc.setSharingPermissions(0);
        assertEquals(0,googleDoc.getSharingPermissions());
    }
}
