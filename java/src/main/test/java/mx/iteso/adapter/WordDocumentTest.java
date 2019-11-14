package mx.iteso.adapter;

import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.WordDocument;
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
    public void getFormatTest() {
        Format format = new Format("Arial", 12);
        assertEquals(wordDocument.getFormat(), format);
    }
    @Test
    public void getBackgroundTest() {
        Image image = new BackgroundImage("image", 1024.0f, 720.0f);
        assertEquals(wordDocument.getBackground().getWidth(), image.getWidth(), 0.0);
        assertEquals(wordDocument.getBackground().getHeight(), image.getHeight(), 0.0);
        assertEquals(wordDocument.getBackground().getPath(), image.getPath(), 0.0);
    }
    @Test
    public void licenceTest() {
        MSLicense wLicense = new MSLicense(16.0f);
        assertEquals(wordDocument.getLicense().getVersion(), wLicense.getVersion(), 0.0);
        assertEquals(wordDocument.getLicense().getSupported(), wLicense.getSupported());
    }
}