package mx.iteso.adapter;
/**GoogleDoc Adapter. */
public class GoogleDocAdapter extends WordDocument {
    /**Google doc. */
    private GoogleDoc googleDoc;
    /**Image. */
    private Image image;
    /**New MSLicense. */
    private MSLicense license;
    /**Constructor.
     * @param gDoc The google doc.
     */
    public GoogleDocAdapter(GoogleDoc gDoc) {
        this.googleDoc = gDoc;
        image = new Image(this.googleDoc.getBackground().getPath(),
        (float) this.googleDoc.getBackground().getWidth(),
        (float) this.googleDoc.getBackground().getHeight());
        float version = (this.googleDoc.getSharingPermissions() == 3)? 16.0f : 15.0f;
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
