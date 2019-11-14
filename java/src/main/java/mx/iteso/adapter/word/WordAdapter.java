package mx.iteso.adapter.word;

import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.Format;
import mx.iteso.adapter.googledocs.IGoogleDoc;

import java.awt.Font;

/**
 * Word Adapter.
 */
public class WordAdapter  implements IGoogleDoc {

    /**
     * Word Doc.
     */
    private IWordDocument wordDocument;

    /**
     *
     * @param newWordDoc .
     */
    public WordAdapter(final WordDocument newWordDoc) {
        this.wordDocument = newWordDoc;
    }

    /**
     *
     * @return font.
     */
    public Font getFont() {
        return this.wordDocument.getFormat().getFont();
    }

    /**
     *
     * @return style format.
     */
    public Format getStyle() {
        return this.wordDocument.getFormat();
    }

    /**
     *
     * @return image backgropuind.
     */
    public BackgroundImage getBackground() {
        return new BackgroundImage(this.wordDocument.getBackground());
    }

    /**
     *
     * @param sharingPermissions .
     */
    public void setSharingPermissions(final int sharingPermissions) {
        return;
    }

    /**
     *
     * @return if license is valid.
     */
    public int getSharingPermissions() {
        return this.wordDocument.restrictEditIfLicenseIsInvalid() ? 0 : 1;
    }
}
