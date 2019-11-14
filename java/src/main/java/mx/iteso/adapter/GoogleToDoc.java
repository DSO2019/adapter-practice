package mx.iteso.adapter;


import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Image;

/**
 * clase.
 */
public class GoogleToDoc implements IWordDocument {
    /**
     * variable.
     */
    private IGoogleDoc google;
    /**
     * variable.
     */
    private float msVersion;
    /**
     * variable.
     */
    private MSLicense msLicense;

    /**
     *
     * @param g .
     */
    public GoogleToDoc(final IGoogleDoc g) {
        this.google = g;
        this.msLicense = new MSLicense("Google's Adapter License");
    }

    /**
     *
     * @return .
     */
    public final Object getFormat() {
        return google.getFont();
    }

    /**
     *
     * @return .
     */
    public final Image getBackground() {
        BackgroundImage bi = google.getBackground();
        return new Image(bi.getImage());
    }

    /**
     *
     * @param msOfficeVersion .
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    /**
     *
     * @return .
     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     *
     * @param msLic .
     * @return .
     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense msLic) {
        if (this.msLicense.getLicense() == msLic.getLicense()) {
            return true;
        } else {
            return false;
        }

    }
}
