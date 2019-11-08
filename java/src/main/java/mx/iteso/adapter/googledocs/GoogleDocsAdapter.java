package mx.iteso.adapter.googledocs;

import mx.iteso.adapter.word.WordDocument;

public class GoogleDocsAdapter extends WordDocument {
    private GoogleDoc mGoogleDoc;

    public GoogleDocsAdapter(GoogleDoc newGoogleDoc){
        this.mGoogleDoc = newGoogleDoc;
    }
}
