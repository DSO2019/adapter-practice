package mx.iteso.adapter;

import mx.iteso.adapter.WordDocument;
import mx.iteso.adapter.WordDocumentAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordDocumentAdapterTest {
    private WordDocumentAdapter adapter;

    @Before
    public void init() {
        adapter = new WordDocumentAdapter(new WordDocument());
    }

    @Test
    public void getFontTest() {
        Font font = new Font("TimesRoman", Font.PLAIN, FONT_SIZE);
        assertEquals(font.getFontName(),googleDoc.getFont().getFontName());
    }

    @Test
    public void getBackgroundTest() {
        assertEquals("image.png",adapter.getBackground().getPath());
        assertEquals(1024.0f,adapter.getBackground().getWidth());
        assertEquals(720.0f,adapter.getBackground().getHeight());
    }
    @Test
    public void getStyleTest() {
        Format style = new Format("Arial", 12);
        assertEquals(style,adapter.getStyle());
    }
    @Test
    public void getSharingPermissionsTest() {
        adapter.setSharingPermissions(1);
        assertEquals(1,googleDoc.getSharingPermissions());
    }
}