package mx.iteso.adapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import java.awt.Font;


public class GoogleDocTest {
    GoogleDoc googledoc;

    @Before
    public void setUp(){
        googledoc = new GoogleDoc();
    }

    @Test
    public void testGetFont(){
        Font temp = googledoc.getFont();
        assertEquals("Ubuntu", temp.getFontName());
    }

    @Test
    public void testGetStyle(){
        assertEquals("Ubuntu", googledoc.getStyle().getFont().getFontName());
    }

    @Test
    public void testGetBackground() {
        assertEquals("img.png", googledoc.getBackground().getImage().getUrl());
    }

    @Test
    public void testSharePermissions() {
        assertEquals(1, googledoc.getSharingPermissions());
        googledoc.setSharingPermissions(0);
        assertEquals(0, googledoc.getSharingPermissions());
    }

}