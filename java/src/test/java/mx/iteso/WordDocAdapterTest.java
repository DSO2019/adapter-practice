package mx.iteso;

import mx.iteso.adapter.*;
import org.junit.*;

public class WordDocAdapterTest {
    WordAdapter wordDocAdapter;
    WordDocument mockedWordDoc;
    Format format;
    @Before
    public void setUp(){
        mockedWordDoc = new WordDocument(new Font("Arial"),new MSLicense("MS License"),
        new Format(new Font("Arial"), "Bold"),new BackgroundImage(new Image("imageUrl")));
        format = mockedWordDoc.getFormat();
        wordDocAdapter = new WordAdapter(mockedWordDoc, new Font("Arial"),new Format(new Font("Arial"), "bold"),"bold");
    }

    @Test
    public void getFontTest() {
        Font result = wordDocAdapter.getFont();
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