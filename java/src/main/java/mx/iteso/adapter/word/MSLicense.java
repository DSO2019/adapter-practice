package mx.iteso.adapter.word;

public class MSLicense {

    private int license = 0;

    public MSLicense(final int license) {
    }

    public  int getLicense(){
        return this.license;
    }

    public void setLicense(final int l){
        this.license = l;
    }

    public boolean isValid(){
        final int validate = 100;
        return this.license >= validate;
    }

}
