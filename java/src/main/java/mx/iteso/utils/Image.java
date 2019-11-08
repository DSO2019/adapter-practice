package mx.iteso.utils;

/** Image class. */
public class Image {
    /** Url attribute. */
    private String url;

    /** Constructor.
     * @param imageUrl image url.
     */
    public Image(final String imageUrl) {
        this.url = imageUrl;
    }

    /** Get url.
     * @return the url.
     */
    public String getUrl() {
        return this.url;
    }
}
