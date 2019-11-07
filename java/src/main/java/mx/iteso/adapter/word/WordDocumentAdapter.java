package mx.iteso.adapter.word;

import mx.iteso.adapter.Font;
import mx.iteso.adapter.Image;
import mx.iteso.adapter.googledoc.GoogleDoc;

public class WordDocumentAdapter extends GoogleDoc {
    private WordDocument wordDocument;
    public WordDocumentAdapter(WordDocument newWordDocument) {
        super();
        this.wordDocument = newWordDocument;
    }

    @Override
    public Font getFont() {
        if (wordDocument.getFormat() != null) {
            return super.getFont();
        }
        return null;
    }

    @Override
    public Image getBackground() {
        return wordDocument.getBackground();
    }

    @Override
    public Object getStyle() {
        if (wordDocument.getFormat() != null) {
            return wordDocument.getFormat();
        }
        return null;
    }
}
