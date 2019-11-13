package mx.iteso.adapter.word;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.Style;
import mx.iteso.adapter.googledoc.GoogleDoc;

/**
 * WordDocumentAdapter Class.
 */
public class WordDocumentAdapter extends GoogleDoc {
    /**
     * Attr type WordDocument.
     */
    private WordDocument wordDocument;
    /**
     * Public constructor.
     * @param newWordDocument WordDocument for the adapter.
     */
    public WordDocumentAdapter(final WordDocument newWordDocument) {
        super();
        this.wordDocument = newWordDocument;
        setSharingPermissions((int) wordDocument.getLicense()
                                                .getLicenseVersion());
    }
    /**
     * Font getter.
     * @return Font of the WordDocument.
     */
    @Override
    public Font getFont() {
        if (wordDocument.getFormat() != null) {
            return wordDocument.getFormat().getFont();
        }
        return null;
    }
    /**
     * Backgroung image getter.
     * @return WordDocument's background image.
     */
    @Override
    public Image getBackground() {
        return wordDocument.getBackground();
    }
    /**
     * Style getter.
     * @return WordDocument's Style.
     */
    @Override
    public Style getStyle() {
        if (wordDocument.getFormat() != null) {
            return new Style(wordDocument.getFormat().getFont());
        }
        return null;
    }
    /**
     * Sharing permissions getter.
     * @return WordDocument's sharing permissions.
     */
    @Override
    public int getSharingPermissions() {
        return super.getSharingPermissions();
    }
}
