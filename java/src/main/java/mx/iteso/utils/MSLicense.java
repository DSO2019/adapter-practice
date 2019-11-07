package mx.iteso.utils;

public class MSLicense {
    private int licenseNumber = -1;

    public MSLicense(final int num) {
        this.licenseNumber = num;
    }

    /**
     * @return the licenseNumber
     */
    public int getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public boolean isValid() {
        final int ZERO = 0;
        return this.licenseNumber > ZERO;
    }
}
