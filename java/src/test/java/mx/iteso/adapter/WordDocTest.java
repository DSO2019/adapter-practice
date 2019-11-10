package mx.iteso.adapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import java.awt.Font;


public class WordDocTest {
    WordDoc worddoc;
    MSLicense mockLicense;

    @Before
    public void setUp(){
        worddoc = new WordDoc(10001);
        mockLicense = mock(MSLicense.class);

    }

    @Test
    public void testGetFormat(){
        assertEquals("Ubuntu", worddoc.getFormat().getFont().getFontName());
    }

    @Test
    public void testGetBackground() {
        assertEquals("img.png", worddoc.getBackground().getUrl());
    }

    @Test
    public void testGetLicense() {
        assertEquals(10001, worddoc.getLicense().getNumber());
    }

    @Test
    public void testRestricEditValid() {
        assertEquals(false, worddoc.restrictEditIfLicenseIsInvalid(worddoc.getLicense()));
    }

    @Test
    public void testRestricEditInvalid() {
        worddoc = new WordDoc(1);
        assertEquals(true, worddoc.restrictEditIfLicenseIsInvalid(worddoc.getLicense()));
    }
}