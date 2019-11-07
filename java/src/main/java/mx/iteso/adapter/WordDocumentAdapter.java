package mx.iteso.adapter;

import java.awt.Font;
/**Word Document Adapter. */
public class WordDocumentAdapter extends GoogleDoc {
    private WordDocument wordDocument;
    private BackgroundImage img;
    private int sharePerms;
    public WordDocumentAdapter(WordDocument nWordDocument) {
        this.wordDocument = nWordDocument;
        this.img = new BackgroundImage(
            this.wordDocument.getBackground().getPath(),
            (int) this.wordDocument.getBackground().getWidth(),
            (int) this.wordDocument.getBackground().getHeight());
        this.sharePerms = (this.wordDocument.getLicense().version > 16.0)? 3 : 1;
    }
    @Override
    public BackgroundImage getBackground() {
        return this.img;
    }

    @Override
    public int getSharingPermissions() {
        return this.sharePerms;
    }
    
}