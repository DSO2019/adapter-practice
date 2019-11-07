package mx.iteso.beans;

/** Background Image class. */
public class BackgroundImage {
    /** The current image contained. */
    private Image image;

    /** Constructor. */
    public BackgroundImage() {
        this.image = new Image("image.png");
    }

    /** Constructor with image param.
     * @param img Image to be set.
     */
    public BackgroundImage(final Image img) {
        this.image = img;
    }

    /** Image getter.
     * @return the current image.
     */
    public Image getImage() {
        return this.image;
    }
}
