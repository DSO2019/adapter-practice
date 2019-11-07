package mx.iteso.adapter.impl.other;

public class MSLicense {
    private boolean validation;

    public MSLicense(){
        validation = true;
    }
    
    public boolean isValid(){
        return validation;
    }
}
