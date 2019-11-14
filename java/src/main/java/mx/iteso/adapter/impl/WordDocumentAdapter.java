package mx.iteso.adapter.impl;


import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.media.Format;
import java.awt.*;
import mx.iteso.adapter.media.Image;


/**
 * Created by Margarita Jauregui on 11/11/19.
 */
public class WordDocumentAdapter implements IGoogleDoc {
    private IWordDocument wordDocument;

    public WordDocumentAdapter(IWordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }
    public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    public void setFont(Format format) {
        this.wordDocument.setFormat(format);
    }

    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    public Image getBackground() {
        return this.wordDocument.getBackground();
    }

}
