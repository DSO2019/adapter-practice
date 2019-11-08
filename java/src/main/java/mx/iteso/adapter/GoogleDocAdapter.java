package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public class GoogleDocAdapter implements IWordDocument {

    /**
    * Google doc.
    */
    private IGoogleDoc googleDoc;

    /**
    *   MS license.
    */
    private MSLicense msLicense;

    /**
    * MS version.
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
     * @return format.
     */
    public final Format getFormat() {
        return new Format(googleDoc.getFont());
    }

    /**
     * @return image background.
     */
    public final Image getBackground() {
        BackgroundImage backgroundImage = googleDoc.getBackground();
        return new Image(backgroundImage.getImage().getUrl());
    }

    /**
     * @param msOfficeVersion MS Office version.
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    /**
     * @return MS Version.
     */
    public final float getMSOfficeVersion() {
        return this.msVersion;
    }

    /**
     * @return MS License.
     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * @param ms MS License.
     * @return boolean.
     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense ms) {
        return this.msLicense.getLicense() == ms.getLicense();

    }
}
