package mx.iteso.adapter;
/**Image class. */
public class Image {
    /**Image path. */
    private String path;
    /**Image width. */
    private float width;
    /**Image height. */
    private float height;
    /**
     * @param nPath path.
     * @param nWidth Width.
     * @param nHeight Height.
     */
    public Image(final String nPath, final float nWidth, final float nHeight) {
        this.path = nPath;
        this.width = nWidth;
        this.height = nHeight;
    }
    /**
     * @return path to image.
     */
    public String getPath() {
        return this.path;
    }
    /**
     * @return image width.
     */
    public float getWidth() {
        return this.width;
    }
    /**
     * @return image height.
     */
    public float getHeight() {
        return this.height;
    }
}
