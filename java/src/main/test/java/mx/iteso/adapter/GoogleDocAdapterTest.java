package mx.iteso.adapter;

import mx.iteso.adapter.GoogleDoc;
import mx.iteso.adapter.GoogleDocAdapter;
import mx.iteso.adapter.MSLicense;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleDocAdapterTest {
    private GoogleDocAdapter adapter;
    @Before
    public void init() {
        adapter = new GoogleDocAdapter(new GoogleDoc());
    }
    @Test
    public void getBackgroundTest() {
        assertEquals("image.png",adapter.getBackground().getPath());
        assertEquals(1024.0f,adapter.getBackground().getWidth());
        assertEquals(720.0f,adapter.getBackground().getHeight());
    }
    @Test
    public void getLicenseTest() {
        assertEquals(16.0f, adapter.getLicense().getVersion, 0.0);
    }

}