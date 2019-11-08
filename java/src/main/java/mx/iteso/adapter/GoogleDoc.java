package mx.iteso.adapter;

/**
 * GoogleDoc.
 */
public class GoogleDoc implements IGoogleDoc {

    /** sharing permissions.*/
    private int sharingPermissions;

    /** font.*/
    private Font font;

    /** style.*/
    private Format style;

    /** background image.*/
    private BackgroundImage backgroundImage;

    /** @param fnt .
     * @param bckimg .
     * @param stl .
     * @param permissions .*/
    public GoogleDoc(final Font fnt, final BackgroundImage bckimg,
        final Format stl, final int permissions) {
        this.font = fnt;
        this.backgroundImage = bckimg;
        this.style = stl;
        this.sharingPermissions = permissions;
    }

    /** @return Font.*/
    public Font getFont() {
        return this.font;
    }

    /** @return Object.*/
    public Object getStyle() {
        return this.style;
    }

    /** @return Backgroundimage.*/
    public BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    /** @return Sharing permissions.*/
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }

    /** @param permissions .*/
    public void setSharingPermissions(final int permissions) {
        this.sharingPermissions = permissions;
    }
}
