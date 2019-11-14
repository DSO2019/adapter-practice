package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.googledocs.GoogleDoc;
import mx.iteso.adapter.googledocs.GoogleDocsAdapter;
import mx.iteso.adapter.word.IWordDocument;

import java.awt.*;

public class GoogleAdapterTest {
    private GoogleDoc googleDocs = new GoogleDoc();
    private IWordDocument wordDocument = new GoogleDocsAdapter(googleDocs);

    public void testFormat(){
        assertEquals(new Font("Roboto", Font.ROMAN_BASELINE, 25), this.wordDocument.getFormat().getFont());
    }

    public  void testBackground(){
        assertEquals(new BackgroundImage(this.wordDocument.getBackground()).getImage().getUrl(), this.wordDocument.getBackground().getUrl());
    }

    public void testLicense(){
        assertEquals(0, this.wordDocument.getLicense().getLicense());
    }

}
