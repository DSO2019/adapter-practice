package mx.iteso.adapter;

/**
 * Class Image.
 */
public class Image {
    /**
     * Attr width of the image.
     */
    private double width;
    /**
     * Attr height of the image.
     */
    private double height;
    /**
     * Public constructor.
     * @param nWidth width for the image.
     * @param nHeight height for the image.
     **/
    public Image(final double nWidth, final double nHeight) {
        this.width = nWidth;
        this.height = nHeight;
    }
    /**
     * Getter of the width.
     * @return Image's width.
     */
    public double getWidth() {
        return width;
    }
    /**
     * Getter of te height.
     * @return Image's height.
     */
    public double getHeight() {
        return height;
    }
}
