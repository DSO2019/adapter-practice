package mx.iteso.adapter;
/**
 * Class GoogleDoc.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * Permissions.
     */
    private int sharingPermissions;
    /**
     * Font.
     */
    private Font font;
    /**
     * Style.
     */
    private Format style;
    /**
     * Background img.
     */
    private BackgroundImg backgroundImage;
    /**
     * GoogleDoc Constructor.
     */
    public GoogleDoc() {
        this.font = new Font("Verdana");
        this.backgroundImage = new BackgroundImg(new Img("SoyUnaUrl"));
        this.style = new Format(this.font, "Regular");
        this.sharingPermissions = 1;
    }
    /**
     * @return getFont.
     */
    public final Font getFont() {
        return this.font;
    }
    /**
     * @return getStyle.
     */
    public final Object getStyle() {
        return this.style;
    }
    /**
     * @return background.
     */
    public final BackgroundImg getBackground() {
        return this.backgroundImage;
    }
    /**
     * @param sharingPerm sharingPerm.
     */
    public final void setSharingPermissions(final int sharingPerm) {
        this.sharingPermissions = sharingPerm;
    }
}
