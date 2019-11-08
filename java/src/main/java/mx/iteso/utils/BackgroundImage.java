package mx.iteso.utils;

/**
 * clase.
 */
public class BackgroundImage {
    /**
     *  variable.
     */
    private String imageRoute;

    /**
     *
     * @param route .
     */
    public BackgroundImage(final String route) {
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
