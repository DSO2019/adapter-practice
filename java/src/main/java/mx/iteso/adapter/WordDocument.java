package mx.iteso.adapter;

/** Word Document.*/
public class WordDocument implements IWordDocument {

    /** Font.*/
    private Font font;

    /** Background Image.*/
    private BackgroundImage backgroundImage;

    /** License.*/
    private MSLicense msLicense;

    /** MS Office Version.*/
    private float version;

    /** Format.*/
    private Format format;

    /** @param fnt .
     * @param bckimg .
     * @param fmt .
     * @param msLic .*/
    public WordDocument(final Font fnt, final MSLicense msLic,
        final Format fmt, final BackgroundImage bckimg) {
        this.font = fnt;
        this.msLicense = msLic;
        this.format = fmt;
        this.backgroundImage = bckimg;
    }

    /** @return Format.*/
    public Format getFormat() {
        return this.format;
    }

    /** @return Background.*/
    public Image getBackground() {
        return this.backgroundImage.getImage();
    }

    /** @param msOfficeVersion .*/
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.version = msOfficeVersion;
    }

    /** @return License.*/
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /** @return Font.*/
    public Font getFont() {
        return this.font;
    }

    /** @return Version.*/
    public float getVersion() {
        return this.version;
    }

    /** @return License
     * @param msLic .*/
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLic) {
        return this.msLicense == msLic;
    }
}
