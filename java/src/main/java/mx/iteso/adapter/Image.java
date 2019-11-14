package mx.iteso.adapter;

/**
 * new image.
 */
public class Image {
    /**
     * image url.
     */
    private String url;

    /**
     *
     * @param newUrl .
     */
    public Image(final String newUrl) {
        this.url = newUrl;
    }

    /**
     *
     * @return ulr of image.
     */
    public String getUrl() {
        return this.url;
    }
}
