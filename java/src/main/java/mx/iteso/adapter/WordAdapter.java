package mx.iteso.adapter;

/** Word to GoogleDoc.*/
public class WordAdapter implements IGoogleDoc {

    /** Word.*/
    private WordDocument word;

    /** License.*/
    private MSLicense ms = new MSLicense("MS License");

    /** Format.*/
    private Format format;

    /** Font.*/
    private Font font;

    /** Style.*/
    private String style;

    /** @param wordDoc . */
    public WordAdapter(final WordDocument wordDoc) {
        this.word = wordDoc;
        font = new Font("Arial");
        style = "bold";
        format = new Format(font, style);
    }

    /** @return Font.*/
    public Font getFont() {
        return this.font;
    }

    /** @return Style.*/
    public Object getStyle() {
        return this.style;
    }

    /** @return Format.*/
    public Object gatFormat() {
        return this.format;
    }

    /** @return Background.*/
    public BackgroundImage getBackground() {
        return new BackgroundImage(word.getBackground());
    }

    /** @param sharingPermissions .*/
    public void setSharingPermissions(final int sharingPermissions) {
        word.setMSOfficeVersion(sharingPermissions);
        word.getLicense();
        word.restrictEditIfLicenseIsInvalid(ms);
    }
}
