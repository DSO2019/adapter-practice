package mx.iteso.adapter;

/**
 * Creado por Lucifer.
 */
public class Image {
    /**
     * URL.
     */
    private String url;

    /**
     * @param u url.
     */
    public Image(final String u) {
        this.url = u;
    }

    /**
     * @return url.
     */
    public final String getUrl() {
        return this.url;
    }
}
