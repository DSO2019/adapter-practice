package mx.iteso.adapter;


import java.awt.Font;

/**
 * Word to Googel Adapter.
 */
public class WordtoGoogleAdapter implements IGoogleDoc {
    /**
     * The word doc.
     */
    private WordDoc worddoc;

    /**
     * The background image.
     */
    private BackgroundImage bckImg;

    /**
     * The valid license number.
     */
    private static final int LICENSE_VALID_NUMBER = 10000;

    /**
     * Creator.
     * @param word to adapt.
     */
    public WordtoGoogleAdapter(final WordDoc word) {
        this.worddoc = word;
        this.bckImg = new BackgroundImage(word.getBackground());
    }

    @Override
    public final Font getFont() {
        Format temp = this.worddoc.getFormat();
        return temp.getFont();
    };

    @Override
    public final Format getStyle() {
        return this.worddoc.getFormat();
    }

    @Override
    public final BackgroundImage getBackground() {
        return this.bckImg;
    };

    @Override
    public final void setSharingPermissions(final int sharingPermissions) {
        return;
    };

    @Override
    public final int getSharingPermissions() {
        if (this.worddoc.getLicense().getNumber()  > LICENSE_VALID_NUMBER) {
            return 1;
        }
        return 0;
    }

}
