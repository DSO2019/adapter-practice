package mx.iteso.adapter;

/**
 * Class GoogleDocAdapter.
 */
public class GoogleDocAdapter implements IWordDocument {
    /**
    * doc.
    */
    private IGoogleDoc googleDoc;
    /**
    * license.
    */
    private MSLicense msLicense;
    /**
    * version.
    */
    private float msVersion;
    /**
     * @param googledoc google doc.
     */
    public GoogleDocAdapter(final IGoogleDoc googledoc) {
        this.googleDoc = googledoc;
        this.msLicense = new MSLicense("Google license");
    }
    /**
     * @return getformat.
     */
    public final Format getFormat() {
        return new Format(googleDoc.getFont());
    }
    /**
     * @return img background.
     */
    public final Img getBackground() {
        BackgroundImg backgroundImage = googleDoc.getBackground();
        return new Img(backgroundImage.getImage().getUrl());
    }
    /**
     * @param msOfficeVersion MS Office version.
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }
    /**
     * @return Version.
     */
    public final float getMSOfficeVersion() {
        return this.msVersion;
    }
    /**
     * @return License.
     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }
    /**
     * @param ms MSLicense.
     * @return boolean.
     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense ms) {
        return this.msLicense.getLicense() == ms.getLicense();

    }
}
