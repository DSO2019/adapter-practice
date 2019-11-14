package mx.iteso.adapter;


import java.time.*;
public class MSLicense {
    private Boolean valid = false;
    private int number;

    public MSLicense(final int number) {
        this.number = number;
        this.valid = true;
    }

    public int getNumber() {
        return this.number;
    }


}
