package mx.iteso;

/**
 * MsLicense.
 */
public class MSLicense {
    /**
     * License number.
     */
    private int number = 0;

    /**
     * MSLicense().
     * @param num the number of license.
     */
    public MSLicense(final int num) {
        this.number = num;
    }

    /**
     * getLicenseNumber().
     * @return getLicenseNumber.
     */
    public int getLicenseNumber() {
        return this.number;
    }

    /**
     * setLicenseNumber().
     * @param n License number.
     */
    public void setLicenseNumber(final int n) {
        this.number = n;
    }

    /**
     * Validate license.
     * @return valid License.
     */
    public boolean isValid() {
        final int validator = 10000;
        return this.number > validator;
    }




}
