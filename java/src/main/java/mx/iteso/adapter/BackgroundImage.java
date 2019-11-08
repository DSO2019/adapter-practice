package mx.iteso.adapter;

/**
 * Created by Lucifer.
 */
public class BackgroundImage {

    /**
     * url.
     */
    private Image image;

    /**
     * @param img image.
     */
    public BackgroundImage(final Image img) {
        this.image = img;
    }

    /**
     * @return url.
     */
    public final Image getImage() {
        return this.image;
    }
}
