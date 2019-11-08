package mx.iteso.adapter;

/** BackgroundImage.*/
public class BackgroundImage {

    /** image.*/
    private Image image;

    /** @param img .*/
    public BackgroundImage(final Image img) {
        this.image = img;
    }

    /** @return url.*/
    public final Image getImage() {
        return this.image;
    }
}
