package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.WordAdapter;
import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

import java.awt.Font;

public class WordAdapterTest {

    private WordDocument wordDocument = new WordDocument(1);
    private IGoogleDoc newGoogleDoc = new WordAdapter(wordDocument);

    @Test
    public void testGetFont() {
        assertEquals(new Font("Calibri", Font.ITALIC, 12), this.newGoogleDoc.getFont());
    }

    @Test
    public void testGetStyle() {
        assertEquals(new Format().getFont(), this.newGoogleDoc.getStyle().getFont());
    }

    @Test
    public void testGetBackground() {
        assertEquals(new BackgroundImage().getImage().getUrl(), this.newGoogleDoc.getBackground().getImage().getUrl());
    }

    @Test
    public void testGetSharingPermissions() {
        this.newGoogleDoc.setSharingPermissions(1);
        assertEquals(1, this.newGoogleDoc.getSharingPermissions());
    }

}