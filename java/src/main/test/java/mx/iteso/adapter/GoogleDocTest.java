package mx.iteso;

import static org.junit.Assert.assertEquals;

import java.awt.Font;

import org.junit.Test;

import mx.iteso.GoogleDoc;
import mx.iteso.BackgroundImage;
import mx.iteso.Format;
import java.awt.Font;

public class GoogleDocumentTest {

    private mx.iteso.adapter.GoogleDoc googleDoc;
    @Before
    public void init() {
        googleDoc = new GoogleDoc();
    }

    @Test
    public void getFontTest() {
        Font font = new Font("TimesRoman", Font.PLAIN, FONT_SIZE);
        assertEquals(font.getFontName(),googleDoc.getFont().getFontName());
    }

    @Test
    public void getStyleTest() {
        Format style = new Format("Arial", 12);
        assertEquals(style,googleDoc.getStyle());
    }

    @Test
    public void getBackgroundTest() {
        assertEquals("image.png",googleDoc.getBackground().getPath());
        assertEquals(1024.0f,googleDoc.getBackground().getWidth());
        assertEquals(720.0f,googleDoc.getBackground().getHeight());
    }

    @Test
    public void getSharingPermissionsTest() {
        googleDoc.setSharingPermissions(1);
        assertEquals(1,googleDoc.getSharingPermissions());
    }
}