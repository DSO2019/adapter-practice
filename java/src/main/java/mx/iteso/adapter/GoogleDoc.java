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

    /** GoogleDoc.*/
    public GoogleDoc() {
            this.font = new Font("Calibri");
            this.backgroundImage = new BackgroundImage(new Image("imageUrl"));
            this.style = new Format(this.font, "Regular");
            this.sharingPermissions = 1;
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
