package mx.iteso.adapter.impl;

import javafx.scene.layout.BackgroundImage;
import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;

import java.awt.*;

public class IWordDocumentAdapter implements IGoogleDoc {
    IWordDocument iWordDocument;

    public IWordDocumentAdapter(IWordDocument iWordDocument1){
        this.iWordDocument = iWordDocument1;
    }

    public Font getFont() {
        return null;
    }

    public Object getStyle() {
        return null;
    }

    public BackgroundImage getBackground() {
        return null;
    }

    public void setSharingPermissions(int SharingPermissions) {

    }
}
