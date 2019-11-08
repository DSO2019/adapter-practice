package mx.iteso.adapter;
/**Background Image class. */
public class BackgroundImage {
    /**Image path. */
    private String path;
    /**Image width. */
    private int width;
    /**Image height. */
    private int height;
    /**
     * @param nPath path.
     * @param nWidth Width.
     * @param nHeight Height.
     */
    public BackgroundImage(final String nPath,
    final int nWidth, final int nHeight) {
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
    public int getWidth() {
        return this.width;
    }
    /**
     * @return image height.
     */
    public int getHeight() {
        return this.height;
    }
}
