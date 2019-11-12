package mx.iteso.adapter;

/**
 * Google to Word Adapter.
 */
public class GoogleToWordAdapter implements IWordDocument {
    /**
     * The google doc.
     */
    private GoogleDoc googledoc;

    /**
     * Number of valid license.
     */
    private static final int LICENSE_VALID_NUMBER = 10000;

    /**
     * Number of invalid license.
     */
    private static final int LICENSE_INVALID_NUMBER = 10001;

    /**
     * Creator.
     * @param google to adapt.
     */
    public GoogleToWordAdapter(final GoogleDoc google) {
        this.googledoc = google;
    }

    @Override
    public final Format getFormat() {
        return this.googledoc.getStyle();
    }

    @Override
    public final Image getBackground() {
        return this.googledoc.getBackground().getImage();
    }

    @Override
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        return;
    }

    @Override
    public final MSLicense getLicense() {
        if (googledoc.getSharingPermissions() == 1) {
            return new MSLicense(LICENSE_VALID_NUMBER + 1);
        }
        return new MSLicense(0);

    }

    @Override
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense msLicense) {
        if (msLicense.getNumber() > LICENSE_VALID_NUMBER) {
            return false;
        }
        return true;
    }

}
