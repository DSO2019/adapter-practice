package mx.iteso.beans;

public class MSLicense {
    int number = 0;

    public MSLicense(int num) {
        this.number = num;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public boolean isValid() {
        return this.number > 10000;
    }
}
