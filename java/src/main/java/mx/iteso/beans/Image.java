package mx.iteso.beans;

/** Image class. */
public class Image {
    /** Image address. */
    private String url;

    /** Constructor.
     * @param incomingUrl the image url.
    */
    public Image(final String incomingUrl) {
        this.url = incomingUrl;
    }

    /** Url getter.
     * @return image address url.
     */
    public String getUrl() {
        return this.url;
    }
}
