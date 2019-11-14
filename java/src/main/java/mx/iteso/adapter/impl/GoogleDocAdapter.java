package mx.iteso.adapter.impl;


import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.media.Format;
import mx.iteso.adapter.media.Image;


/**
 * Created by Margarita Jauregui on 11/11/19.
 */
public class GoogleDocAdapter implements IWordDocument {
    /**
     * IGoogleDoc object.
     */
    private IGoogleDoc googleDoc;
    /**
     * Version number.
     */
    private float msOfficeVersion;
    /**
     * License number.
     */
    private MSLicense msLicense;
    /**
     * Format.
     */
    private Format format;

    /**
     * Class constructor.
     * @param googleDoc target
     */
    public GoogleDocAdapter(IGoogleDoc googleDoc) {
        this.googleDoc = googleDoc;
    }

    /**
     * Format getter.
     * @return format
     */
    public Format getFormat() {
        return (Format) this.googleDoc.getStyle();
    }

    /**
     * Format setter.
     * @param format new format
     */
    public void setFormat(Format format) {
        this.format = format;
    }

    /**
     * Image getter.
     * @return Image
     */
    public Image getBackground() {
        return this.googleDoc.getBackground();
    }

    /**
     * MSOfficeVersion setter.
     * @param msOfficeVersion number
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    /**
     * MSLicense getter.
     * @return
     */
    public MSLicense getLicense() {
        return null;
    }

    /**
     * Getter for permission.
     * @param msLicense number
     * @return
     */
    public boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        return false;
    }
}
