package mx.iteso;

/**
 * Image.
 */
public class Image {

    /**
     * getUrl().
     * @return imageUrl.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Image address.
     */
    private String url;

    /**
     * Image() constructor.
     * @param imageUrl .
     */
    public Image(final String imageUrl) {
        this.url = imageUrl;
    }


}
