package mx.iteso.adapter;

public class MSLicense {
    private boolean validation = true;

    /**
     * @param validation the validation to set
     */
    public void setValidation(boolean validation) {
        this.validation = validation;
    }

	public boolean isInvalid() {
		return !this.validation;
	}
}
