package mx.iteso;

/**
 * Background.
 */
public class BackgrdImage {

    /**
     * image.
     * @param img Image to be set.
     */
    public BackgrdImage(final Image img) {
        this.image = img;
    }


    /**
     * image.
     */
    private Image image;


    /**
     * getImage().
     * @return image.
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Image cons.
     */
    public BackgrdImage() {
        this.image = new Image("image.png");
    }



}
