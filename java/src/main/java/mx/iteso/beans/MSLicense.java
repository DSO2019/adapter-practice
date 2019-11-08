package mx.iteso.beans;

/** Ms License class. */
public class MSLicense {
    /** License number. */
    private int number = 0;

    /** Constructor.
     * @param num the number of license.
     */
    public MSLicense(final int num) {
        this.number = num;
    }

    /**
     * License getter.
     * @return License number.
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * License setter.
     * @param n The license number.
     */
    public void setNumber(final int n) {
        this.number = n;
    }

    /**
     * License number validator.
     * @return if license number is valid.
     */
    public boolean isValid() {
        final int validator = 10000;
        return this.number > validator;
    }
}
