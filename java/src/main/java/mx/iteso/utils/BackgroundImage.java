package mx.iteso.utils;

/** BackgroundImage class. */
public class BackgroundImage {

    /** Image attribute. */
    private Image img;

    /** Constructor. */
    public BackgroundImage() {
        this.img = new Image("someurl.jpg");
    }

    /** Constructor.
     * @param image image.
     */
    public BackgroundImage(final Image image) {
        this.img = image;
    }

    /** Get image method.
     * @return the img.
     */
    public Image getImage() {
        return this.img;
    }
}
