package mx.iteso.adapter.media;


public class Image {
    /**
     * Width pixels.
     */
    private int width;
    /**
     * Lenght pixels.
     */
    private int length;
    /**
     * Image's content/
     */
    private String content;

    /**
     * Image class constructor.
     * @param content of the image
     * @param width of the image
     * @param length of the image
     */
    public Image(final String content, final int width, final int length) {
        this.content = content;
        this.length = length;
        this.width = width;
    }

    /**
     * Modifier for width and leght.
     * @param width new pixel count.
     * @param length new pixel count.
     */
    public void reshape(final int width, final int length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Width's getter method.
     * @return current width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Length's getter method.
     * @return current value
     */
    public int getLength() {
        return this.length;
    }
}
