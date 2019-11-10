package mx.iteso.adapter;

/**
 * The License.
 */
public class MSLicense {
    /**
     * The number license.
     */
    private int number;

    /**
     * Creator.
     * @param lscNumber license number.
     */
    public MSLicense(final int lscNumber) {
        this.number = lscNumber;
    }

    /**
     * Return the license number.
     * @return license number.
     */
    public final int getNumber() {
        return this.number;
    }
}
