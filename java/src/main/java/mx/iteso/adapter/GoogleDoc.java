package mx.iteso.adapter;

import java.awt.Font;
/**Google doc class. */
public class GoogleDoc implements IGoogleDoc {
    /**Permisos. 1 = Solo ver, 2 = Puede comentar, 3 = Puede editar */
    private int sharingPermissions;
    /**Font. */
    private Font font;
    /**Style using format class. */
    private Format style;
    /**Background image. */
    private BackgroundImage bImage;
    /**font size. */
    private static final int FONT_SIZE = 20;
    /**image width. */
    private static final int IMAGE_WIDTH = 1024;
    /**image height. */
    private static final int IMAGE_HEIGHT = 720;
    /**Constructor. */
    public GoogleDoc() {
        this.font = new Font("TimesRoman", Font.PLAIN, FONT_SIZE);
        this.bImage = new BackgroundImage("bgImage.jpg",
        IMAGE_WIDTH, IMAGE_HEIGHT);
        this.style = new Format("Arial", 12);
    }
    /**
     * @return font.
     */
    public Font getFont() {
        return this.font;
    }
    /**
     * @return style.
     */
    public Format getStyle() {
        return this.style;
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
     * @param sharingPermissions2 permissions.
     */
    public void setSharingPermissions(final int sharingPermissions2) {
        this.sharingPermissions = sharingPermissions2;
    }
}
