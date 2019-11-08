package mx.iteso;
import mx.iteso.adapter.*;
import org.junit.*;

public class WordAdapterTest {
    WordAdapter wordDocAdapter;
    WordDocument mockedWordDoc;
    Format format;
    @Before
    public void setUp(){
        mockedWordDoc = new WordDocument();
        format = mockedWordDoc.getFormat();
        wordDocAdapter = new WordAdapter(mockedWordDoc);
    }
    @Test
    public void getFontTest() {
        Font result = wordDocAdapter.getFont();
    }
    @Test
    public void getStyleTest() {
        String result = (String) wordDocAdapter.getStyle();
        Assert.assertEquals("style", result);
    }
    @Test
    public void getBackgroundTest() {
        String backgroundImage = wordDocAdapter.getBackground().getImage().getUrl();
        Assert.assertEquals("SoyUnaUrl", backgroundImage);
    }
    @Test
    public void setSharingPermissionsTest() {
        wordDocAdapter.setSharingPermissions(3);
    }
}
