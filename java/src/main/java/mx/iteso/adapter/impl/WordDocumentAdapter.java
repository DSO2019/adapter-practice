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
    /**
     * IWordDocument.
     */
    private IWordDocument wordDocument;

    /**
     * Class constructor.
     * @param wordDocument this
     */
    public WordDocumentAdapter(IWordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    /**
     * Font getter.
     * @return font
     */
    public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    /**
     * Font setter.
     * @param format new
     */
    public void setFont(Format format) {
        this.wordDocument.setFormat(format);
    }

    /**
     * Style getter.
     * @return
     */
    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    /**
     * Background getter.
     * @return
     */
    public Image getBackground() {
        return this.wordDocument.getBackground();
    }

}
