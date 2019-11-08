package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public class WordDocAdapter implements IGoogleDoc {
    /**
    * Word document.
    */
    private IWordDocument wordDocument;

    /**
    * License.
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
     * @param wordDoc Word Document.
     */
    public WordDocAdapter(final IWordDocument wordDoc) {
        this.wordDocument = wordDoc;
        font = new Font("Arial");
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
    public final BackgroundImage getBackground() {
        return new BackgroundImage(wordDocument.getBackground());
    }

    /**
     * @param sharingPermissions Sharing Permissions.
     */
    public final void setSharingPermissions(final int sharingPermissions) {
        wordDocument.setMSOfficeVersion(sharingPermissions);
        wordDocument.getLicense();
        wordDocument.restrictEditIfLicenseIsInvalid(ms);

    }
}
