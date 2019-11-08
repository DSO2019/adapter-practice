package mx.iteso.adapter;
/**
 * Class BackgroundImg.
 */
public class BackgroundImg {
    /**
     * image.
     */
    private Img image;
    /**
     * @param img image.
     */
    public BackgroundImg(final Img img) {
        this.image = img;
    }
    /**
     * @return url.
     */
    public final Img getImage() {
        return this.image;
    }
}
