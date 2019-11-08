package mx.iteso.utils;

/**
 * Clase.
 */
public class Image {
    /**
     * variable.
     */
    private String imageRoute;

    /**
     *
     * @param route .
     */
    public Image(final String route) {
        imageRoute = route;
    }

    /**
     *
     * @return .
     */
    public final String getImage() {
        return this.imageRoute;
    }
}
