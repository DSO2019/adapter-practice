package mx.iteso.adapter;

import java.awt.Font;

public class GoogleDoc implements IGoogleDoc {
    /**Permisos. 1 = Solo ver, 2 = Puede comentar, 3 = Puede editar */
    private int sharingPermissions;
    /**Font. */
    private Font font;
    /**Background image. */
    private BackgroundImage bImage;
    /**Constructor. */
    public GoogleDoc() {
        this.font = new Font("TimesRoman", Font.PLAIN, 20);
        this.bImage = new BackgroundImage("bgImage.jpg", 1024, 720);
    }
    /**
     * @return font.
     */
    public Font getFont() {
        return this.font;
    }
    /**
     * @return null.
     */
    public Object getStyle() {
        return null;
    }
    /**
     * @return background image.
     */
    public BackgroundImage getBackground() {
        return this.bImage;
    }
    /**
     * @return sharing permissions.
     */
    public int getSharingPermissions() {
        return this.sharingPermissions;
    }
    /**
     * Permissions.
     * @param sharingPermissions permissions.
     */
    public void setSharingPermissions(int SharingPermissions) {
        this.sharingPermissions = SharingPermissions;
    }
}
