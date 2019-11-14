package mx.iteso.adapter;

import static org.junit.Test;
import static org.junit.Before;
import static org.junit.Assert.assertEquals;

import mx.iteso.adapter.impl.adapter.WordAdapter;
import mx.iteso.adapter.impl.document.WordDoc;
import mx.iteso.adapter.impl.other.BackgroundImage;
/**
 * Word adapter test class.
 */
public class WordAdapterTest {
    /**
     * Word document.
     */
    private WordDoc wd;
    /**
     * Converted wd to gd.
     */
    private WordAdapter wa;
    /**
     * Set up method.
     */
    @Before
    public void SetUp() {
        wd = new WordDoc();
        wa = new WordAdapter(wd);
    }
    /**
     * Font test.
     */
    @Test
    public void fontTest() {
        assertEquals(null, wa.getFont());
    }
    /**
     * Style test.
     */
    @Test
    public void styleTest() {
        Object style = new Object();
        assertEquals(true, style.equals(wa.getStyle()));
    }
    /**
     * Get bi test.
     */
    @Test
    public void getBITest() {
        BackgroundImage bi = new BackgroundImage();
        assertEquals(true, bi.equals(wa.getBackground()));
    }
    /**
     * Sharing permissions test.
     */
    @Test
    public void setPermissionsTest() {
        assertEquals("Sharing permissions are not enabled", wa.setSharingPermissions(0));
        assertEquals("Sharing permissions enabled", wa.setSharingPermissions(1));
    }    
}
