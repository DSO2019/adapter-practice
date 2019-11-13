package mx.iteso.adapter;

import mx.iteso.adapter.googledoc.GoogleDoc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoogleDocTest {
    private GoogleDoc googleDoc;
    @Before
    public void init() {
        this.googleDoc = new GoogleDoc();
    }

    @Test
    public void fontTest() {
        Font gFont = googleDoc.getFont();
        assertEquals("TimesNewRoman", gFont.getFontName());
        assertEquals(25, gFont.getFontSize());
    }
    @Test
    public void styleTest() {
        Style gStyle = googleDoc.getStyle();
        assertEquals("TimesNewRoman", gStyle.getFont().getFontName());
        assertEquals(25, gStyle.getFont().getFontSize());

    }
    @Test
    public void backgroundTest() {
        Image gBackground = googleDoc.getBackground();
        assertEquals(400.0, gBackground.getWidth(), 0.0);
        assertEquals(600.0, gBackground.getHeight(), 0.0);
    }
    @Test
    public void sharingPermissionsTest() {
        assertEquals(2, googleDoc.getSharingPermissions());
    }
}
