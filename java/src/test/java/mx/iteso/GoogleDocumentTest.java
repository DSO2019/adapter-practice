package mx.iteso;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Format;

import java.awt.Font;

public class GoogleDocumentTest {

    private GoogleDocument googleDoc = new GoogleDocument();

    @Test
    public void testGetFont() {
        assertEquals(new Font("Calibri", Font.ITALIC, 12), this.googleDoc.getFont());
    }

    @Test
    public void testGetStyle() {
        assertEquals(new Format().getFont(), this.googleDoc.getStyle().getFont());
    }

    @Test
    public void testGetBackground() {
        assertEquals(new BackgroundImage().getImage().getUrl(), this.googleDoc.getBackground().getImage().getUrl());
    }

    @Test
    public void testGetSharingPermissions() {
        this.googleDoc.setSharingPermissions(10);
        assertEquals(10, this.googleDoc.getSharingPermissions());
    }

}