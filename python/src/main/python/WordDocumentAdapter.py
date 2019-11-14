package mx.iteso.adapter;

/**Word Document Adapter. */
public class WordDocumentAdapter extends GoogleDoc {
    /**Word document. */
    private WordDocument wordDocument;
    /**Background image. */
    private BackgroundImage img;
    /**Share permissions. */
    private int sharePerms;
    /**Edit permissions. */
    private static final int EDIT_PERMISSIONS = 3;
    /**Valid version. */
    private static final float VALID_VERSION = 16.0F;
    /**see permissions. */
    private static final int SEE_PERMISSIONS = 1;
    /**Constructor.
     * @param nWordDocument Word Document.
     */
    public WordDocumentAdapter(final WordDocument nWordDocument) {
        this.wordDocument = nWordDocument;
        this.img = new BackgroundImage(
            this.wordDocument.getBackground().getPath(),
            (int) this.wordDocument.getBackground().getWidth(),
            (int) this.wordDocument .getBackground().getHeight());
        this.sharePerms = (this.wordDocument.getLicense()
        .getVersion() > VALID_VERSION) ? EDIT_PERMISSIONS : SEE_PERMISSIONS;
    }
    /**
     * @return background.
     */
    @Override
    public BackgroundImage getBackground() {
        return this.img;
    }
    /**
     * @return Sharing permissions.
     */
    @Override
    public int getSharingPermissions() {
        return this.sharePerms;
    }
}
