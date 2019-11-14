package mx.iteso;

import mx.iteso.adapter.*;
import org.junit.*;


public class WordDocAdapterTest {
    WordAdapter wordAdapter;
    WordDocument mockedWordDoc;
    Format format;
    @Before
    public void setUp(){
        mockedWordDoc = new WordDocument();
        format = mockedWordDoc.getFormat();
        wordAdapter = new WordAdapter(mockedWordDoc);

    }

    @Test
    public void getFontTest() {
        Font result = wordAdapter.getFont();
    }

    @Test
    public void getStyleTest() {
        String result = (String) wordAdapter.getStyle();
        Assert.assertEquals("bold", result);
    }

    @Test
    public void getBackgroundTest() {
        String backgroundImage = wordAdapter.getBackground().getImage().getUrl();
        Assert.assertEquals("imageUrl", backgroundImage);
    }

    @Test
    public void setSharingPermissionsTest() {
        wordAdapter.setSharingPermissions(3);
    }
}