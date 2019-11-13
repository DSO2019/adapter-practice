package mx.iteso.adapter.googledoc;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.Style;

/**
 * GoogleDoc Class.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * Attr sharing permissions.
     */
    private int sharingPermissions;
    /**
     * Attr type Font.
     */
    private Font font;
    /**
     * Attr type Style.
     */
    private Style style;
    /**
     * Attr type Image.
     */
    private Image image;
    /**
     * Public constructor.
     * */
    public GoogleDoc() {
        font = new Font("TimesNewRoman",
                        GoogleDocConstants.DEFAULT_FONT_SIZE);
        style = new Style(this.font);
        image = new Image(GoogleDocConstants.DEFAULT_BACKGROUND_WIDTH,
                          GoogleDocConstants.DEFAULT_BACKGROUND_HEIGHT);
        setSharingPermissions(2);
    }
    /**
     * Font getter.
     * @return GoogleDoc's Font.
     */
    public Font getFont() {
        return font;
    }
    /**
     * Style getter.
     * @return GoogleDoc's Style.
     */
    public Style getStyle() {
        return style;
    }
    /**
     * Background image getter.
     * @return GoogleDoc's background image.
     */
    public Image getBackground() {
        return image;
    }
    /**
     * Setter for sharing permissions.
     * @param newSharingPermissions sharing permissions to be set.
     */
    public void setSharingPermissions(final int newSharingPermissions) {
        this.sharingPermissions = newSharingPermissions;
    }
    /**
     * Sharing Permissions getter.
     * @return GoogleDoc's sharing permissions.
     */
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }
}
