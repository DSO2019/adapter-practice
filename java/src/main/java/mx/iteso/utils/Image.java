package mx.iteso.utils;

public class Image {
    private String url;

	public Image(final String imageUrl) {
        this.url = imageUrl;
    }
    
    /**
     * @return the url
     */
    public String getUrl() {
        return this.url;
    }
}
