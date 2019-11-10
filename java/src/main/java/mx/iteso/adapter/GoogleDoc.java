package mx.iteso.adapter;


import java.awt.Font;

/**
 * A google document.
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * The font of the document.
     */
    private Font font;

    /**
     * The background image.
     */
    private BackgroundImage bckImage;

    /**
     * The style the document.
     */
    private Format style;

    /**
     * The sharing permission.
     */
    private int shrPermissions;

    /**
     * Creator.
     */
    public GoogleDoc() {
        this.style = new Format();
        this.font = this.style.getFont();
        this.bckImage = new BackgroundImage(new Image("img.png"));
        this.shrPermissions = 1;
    }

    @Override
    public final Font getFont() {
        return this.font;
    }

    @Override
    public final Format getStyle() {
        return this.style;
    }

    @Override
    public final BackgroundImage getBackground() {
        return this.bckImage;
    }

    @Override
    public final void setSharingPermissions(final int sharingPermissions) {
        this.shrPermissions = SharingPermissions;
    }

    @Override
    public final int getSharingPermissions() {
        return this.shrPermissions;
    }

}
