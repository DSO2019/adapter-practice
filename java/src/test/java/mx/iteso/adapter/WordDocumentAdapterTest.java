package mx.iteso.adapter;

import mx.iteso.adapter.word.WordDocument;
import mx.iteso.adapter.word.WordDocumentAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordDocumentAdapterTest {
    private WordDocumentAdapter wAdapter;
    @Before
    public void init() {
        wAdapter = new WordDocumentAdapter(new WordDocument());
    }
    @Test
    public void fontTest() {
        Font wAdapterFont = wAdapter.getFont();
        assertEquals("Arial", wAdapterFont.getFontName());
        assertEquals(12, wAdapterFont.getFontSize());
    }
    @Test
    public void backgroundTest() {
        Image wAdapterBackground = wAdapter.getBackground();
        assertEquals(100.0, wAdapterBackground.getWidth(), 0.0);
        assertEquals(200.0, wAdapterBackground.getHeight(), 0.0);
    }
    @Test
    public void styleTest() {
        Style wAdapterStyle = wAdapter.getStyle();
        assertEquals("Arial", wAdapterStyle.getFont().getFontName());
        assertEquals(12, wAdapterStyle.getFont().getFontSize());
    }
    @Test
    public void sharingPermissionsTest() {
        assertEquals(1, wAdapter.getSharingPermissions());
    }
}
