package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public class GoogleDoc implements IGoogleDoc {

    /**
     * sharing permissions.
     */
    private int sharingPermissions;

    /**
     * font.
     */
    private Font font;

    /**
     * style.
     */
    private Format style;

    /**
     * background image.
     */
    private BackgroundImage backgroundImage;

    /**
     * Constructor.
     */
    public GoogleDoc() {
        this.font = new Font("Arial");
        this.backgroundImage = new BackgroundImage(new Image("imageUrl"));
        this.style = new Format(this.font, "Regular");
        this.sharingPermissions = 1;
    }

    /**
     * @return font.
     */
    public final Font getFont() {
        return this.font;
    }

    /**
     * @return style.
     */
    public final Object getStyle() {
        return this.style;
    }

    /**
     * @return background.
     */
    public final BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    /**
     * @param sharingPerm sharing permissions.
     */
    public final void setSharingPermissions(final int sharingPerm) {
        this.sharingPermissions = sharingPerm;
    }
}
