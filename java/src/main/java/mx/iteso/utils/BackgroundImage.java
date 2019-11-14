package mx.iteso.utils;

/**
 * class BackgroundImage.
 */
public class BackgroundImage {

    /**
     * img.
     */
    private Image img;

    /**
     * Constructor.
     */
    public BackgroundImage() {
        this.img = new Image("url.jpg");
    }

    /**
     * Constructor.
     *
     * @param img image.
     */
    public BackgroundImage(final Image img) {
        this.img = img;
    }

    /**
     * Get image.
     *
     * @return Image.
     */
    public Image getImage() {
        return this.img;
    }
}
