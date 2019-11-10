package mx.iteso.adapter;

/**
 * A background image.
 */
public class BackgroundImage {
    /**
     * The real image.
     */
    private Image img;

    /**
     * Creator.
     * @param imgBck the image;
     */
    public BackgroundImage(final Image imgBck) {
        this.img = imgBck;
    }

    /**
     * Return the image.
     * @return the image.
     */
    public final Image getImage() {
        return this.img;
    }
}
