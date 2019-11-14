package mx.iteso.utils;

/**
 * Image class.
 */
public class Image {
    /**
     * Url.
     */
    private String url;

    /**
     * Constructor.
     *
     * @param url image url.
     */
    public Image(final String url) {
        this.url = url;
    }

    /**
     * Get url.
     *
     * @return the url.
     */
    public String getUrl() {
        return this.url;
    }
}
