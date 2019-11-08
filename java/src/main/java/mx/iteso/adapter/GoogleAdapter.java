package mx.iteso.adapter;

/** Word to GoogleDoc.*/
public class GoogleAdapter implements IWordDocument {

    /** Google.*/
    private GoogleDoc doc;

    /** MS license.*/
    private MSLicense msLicense;

    /** MS version.*/
    private float msVersion;

    /** @param doc1 .*/
    public GoogleAdapter(final GoogleDoc doc1) {
        this.doc = doc1;
        this.msLicense = new MSLicense("Google license");
    }

    /** @return Format. */
    public Object getFormat() {
        return new Format(doc.getFont());
    }

    /** @return Background.*/
    public Image getBackground() {
        BackgroundImage backgroundImage = doc.getBackground();
        return new Image(backgroundImage.getImage().getUrl());
    }

    /** @param msOfficeVersion .*/
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    /** @return MS Version.*/
    public final float getMSOfficeVersion() {
        return this.msVersion;
    }

    /** @return License.*/
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /** @return license
     * @param msLic .*/
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLic) {
        return this.msLicense.getLicense() == msLic.getLicense();
    }
}
