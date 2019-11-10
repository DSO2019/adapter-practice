package mx.iteso.adapter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

import java.awt.Font;


public class GoogletoWordAdapterTest {
    GoogleToWordAdapter gToWordAdapter;
    GoogleDoc googledoc;

    @Before
    public void setUp(){
        googledoc = new GoogleDoc();
        gToWordAdapter = new GoogleToWordAdapter(googledoc);

    }

    @Test
    public void testGetFormat(){
        assertEquals("Ubuntu", gToWordAdapter.getFormat().getFont().getFontName());
    }

    @Test
    public void testGetBackground() {
        assertEquals("img.png", gToWordAdapter.getBackground().getUrl());
    }

    @Test
    public void testGetLicense() {
        assertEquals(10001, gToWordAdapter.getLicense().getNumber());
    }

    @Test
    public void testRestricEditValid() {
        assertEquals(false, gToWordAdapter.restrictEditIfLicenseIsInvalid(gToWordAdapter.getLicense()));
    }

    @Test
    public void testRestricEditInvalid() {
        googledoc.setSharingPermissions(0);
        assertEquals(true, gToWordAdapter.restrictEditIfLicenseIsInvalid(gToWordAdapter.getLicense()));
    }
}