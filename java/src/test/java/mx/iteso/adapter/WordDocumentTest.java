package mx.iteso.adapter;

import mx.iteso.adapter.word.MSLicense;
import mx.iteso.adapter.word.WordDocument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordDocumentTest {
    private WordDocument wordDocument;
    @Before
    public void init() {
        wordDocument = new WordDocument();
    }
    @Test
    public void formatTest() {
        Format wFormat = wordDocument.getFormat();
        assertEquals("Arial", wFormat.getFont().getFontName());
        assertEquals(12, wFormat.getFont().getFontSize());
    }
    @Test
    public void backgroundTest() {
        Image wBackground = wordDocument.getBackground();
        assertEquals(100.0, wBackground.getWidth(), 0.0);
        assertEquals(200.0, wBackground.getHeight(), 0.0);
    }
    @Test
    public void licenceTest() {
        MSLicense wLicense = wordDocument.getLicense();
        assertEquals(1.6, wLicense.getLicenseVersion(), 0.0);
        assertTrue(wordDocument.restrictEditIfLicenseIsInvalid());
    }
}
