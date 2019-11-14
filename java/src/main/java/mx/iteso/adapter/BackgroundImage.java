package mx.iteso.adapter;

/**
 * Background image Adapter.
 */
public class BackgroundImage {
    /**
     * new Image.
     */
    private Image image;

    /**
     * Background image.
     * @param background .
     */
    public BackgroundImage(final Image background) {
        this.image = new Image("image.jpg");
    }

    /**
     *
     * @return img
     */
    public Image getImage() {
        return this.image;
    }
}
