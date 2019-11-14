package mx.iteso.adapter;

import java.awt.Font;

import mx.iteso.adapter.impl.document.GoogleDoc;
import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.other.BackgroundImage;
import static org.junit.Test;
import static org.junit.Before;
import static org.junit.Assert.assertEquals;
/**
 * Google doc test class.
 */
public class GoogleDocTest {
    /**
     * Google document.
     */
    private GoogleDoc gd;
    @Before
    public void SetUp() {
        gd = new GoogleDoc();
    }
    /**
     * Font test.
     */
    @Test
    public void testFont() {
        Font font = gd.getFont();
        assertEquals("Arial", font.getName());
    }
    /**
     * Style test.
     */
    @Test
    public void styleTest() {
        Object style = new Object();
        assertEquals(true, style.equals(gd.getStyle()));
    }
    /**
     * Background image test.
     */
    @Test
    public void backgroundImageTest() {
        BackgroundImage bi = new BackgroundImage();
        assertEquals(true, bi.equals(gd.getBackground()));
    }
    /**
     * Sharing permissions test.
     */
    @Test
    public void permissionsTest() {
        assertEquals("Sharing permissions are not enabled", gd.setSharingPermissions(0));
        assertEquals("Sharing permissions enabled", gd.setSharingPermissions(1));
    }
}
