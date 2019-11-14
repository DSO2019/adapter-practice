package mx.iteso;

import mx.iteso.adapter.*;
import org.junit.*;


public class WordDocAdapterTest {
    WordDocAdapter wordDocAdapter;
    WordDocument mockedWordDoc;
    @Before
    public void setUp(){
        mockedWordDoc = new WordDocument();
        wordDocAdapter = new WordDocAdapter(mockedWordDoc);

    }

    @Test
    public void getFontTest() {
        Font result = wordDocAdapter.getFont();
        Assert.assertSame(result.getFont(),"Arial");

    }

    @Test
    public void getStyleTest() {
        String result = (String) wordDocAdapter.getStyle();
        Assert.assertEquals("bold", result);

    }

    @Test
    public void getBackgroundTest() {
        String backgroundImage = wordDocAdapter.getBackground().getImage().getUrl();
        Assert.assertEquals("imageUrl", backgroundImage);
    }

    @Test
    public void setSharingPermissionsTest() {
        wordDocAdapter.setSharingPermissions(3);
    }
}