package mx.iteso.adapter;
/**
 * Class WordAdapter.
 */
public class WordAdapter implements IGoogleDoc {
    /**
    * document.
    */
    private IWordDocument wordDocument;
    /**
    * msLicense.
    */
    private MSLicense ms = new MSLicense("MS License");
    /**
    * Format.
    */
    private Format format;
    /**
    * Font.
    */
    private Font font;
    /**
     * Style.
     */
    private String style;
    /**
     * @param wordDoc wordDoc.
     */
    public WordAdapter(final IWordDocument wordDoc) {
        this.wordDocument = wordDoc;
        font = new Font("Verdana");
        style = "bold";
        format = new Format(font, style);
    }
    /**
     * @return Font.
     */
    public final Font getFont() {
        return format.returnFont();
    }
    /**
     * @return Style.
     */
    public final Object getStyle() {
        return format.getStyle();
    }
    /**
     * @return Background.
     */
    public final BackgroundImg getBackground() {
        return new BackgroundImg(wordDocument.getBackground());
    }
    /**
     * @param sharingPermissions sharingPermissions.
     */
    public final void setSharingPermissions(final int sharingPermissions) {
        wordDocument.setMSOfficeVersion(sharingPermissions);
        wordDocument.getLicense();
        wordDocument.restrictEditIfLicenseIsInvalid(ms);
    }
}
