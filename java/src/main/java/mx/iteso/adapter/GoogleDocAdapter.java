package mx.iteso.adapter;
/**GoogleDoc Adapter. */
public class GoogleDocAdapter extends WordDocument {
    /**Google doc. */
    private GoogleDoc googleDoc;
    /**Image. */
    private Image image;
    /**New MSLicense. */
    private MSLicense license;
    /**Edit permissions. */
    private static final int EDIT_PERMISSIONS = 3;
    /**Valid version. */
    private static final float VALID_VERSION = 16.0F;
    /**invalid version. */
    private static final float INVALID_VERSION = 15.0f;
    /**Constructor.
     * @param gDoc The google doc.
     */
    public GoogleDocAdapter(final GoogleDoc gDoc) {
        this.googleDoc = gDoc;
        image = new Image(this.googleDoc.getBackground().getPath(),
        (float) this.googleDoc.getBackground().getWidth(),
        (float) this.googleDoc.getBackground().getHeight());
        float version = (this.googleDoc.getSharingPermissions()
            == EDIT_PERMISSIONS) ? VALID_VERSION : INVALID_VERSION;
        license = new MSLicense(version);
    }
    /**
     * @return image.
     */
    @Override
    public Image getBackground() {
        return this.image;
    }
    /**
     * @return license.
     */
    @Override
    public MSLicense getLicense() {
        return this.license;
    }
}
