package mx.iteso.utils;

public class BackgroundImage {

    private Image img;

    public BackgroundImage() {
        this.img = new Image("someurl.jpg");
    }

    public BackgroundImage(final Image image) {
        this.img = image;
    }

    /**
     * @return the img
     */
    public Image getImage() {
        return this.img;
    }

}
