package mx.iteso.adapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import java.awt.Font;


public class WordToGoogleAdapterTest {
    WordtoGoogleAdapter wToGoogleAdapter;
    WordDoc worddoc;

    @Before
    public void setUp(){
        worddoc = new WordDoc(10001);
        wToGoogleAdapter = new WordtoGoogleAdapter(worddoc);
    }

    @Test
    public void testGetFont(){
        Font temp = wToGoogleAdapter.getFont();
        assertEquals("Ubuntu", temp.getFontName());
    }

    @Test
    public void testGetStyle(){
        assertEquals("Ubuntu", wToGoogleAdapter.getStyle().getFont().getFontName());
    }

    @Test
    public void testGetBackground() {
        assertEquals("img.png", wToGoogleAdapter.getBackground().getImage().getUrl());
    }

    @Test
    public void testSharePermissions() {
        assertEquals(1, wToGoogleAdapter.getSharingPermissions());
        wToGoogleAdapter.setSharingPermissions(0);
        assertEquals(0, wToGoogleAdapter.getSharingPermissions());
    }

}