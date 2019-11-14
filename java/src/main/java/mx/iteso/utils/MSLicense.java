package mx.iteso.utils;

/**
 * MS License class.
 */
public class MSLicense {
    /**
     * licenseNumber.
     */
    private int licenseNumber;

    /**
     * Constructor.
     *
     * @param num num.
     */
    public MSLicense(final int num) {
        this.licenseNumber = num;
    }

    /**
     * Get license number.
     *
     * @return the licenseNumber
     */
    public int getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Set license.
     *
     * @param newLicenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(final int newLicenseNumber) {
        this.licenseNumber = newLicenseNumber;
    }

    /**
     * Is valid.
     *
     * @return license number.
     */
    public boolean isValid() {
        final int zero = 0;
        return this.licenseNumber > zero;
    }
}
