package mx.iteso.adapter;

import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.IGoogleDoc;

public class WordAdapter implements IGoogleDoc {
    IWordDocument worddoc;

    public void GoogleAdapter(IGoogleDoc google){
        this.googledoc = google;
    }

    public Object getStyle(){
        this.worddoc.getFormat();
    }

    @Override
    public Image getBackground(){
        this.worddoc.getBackground();
    }

    public Font getFont(){
        return new Font();
    };
    
    public void setSharingPermissions(int SharingPermissions){
        return;
    };

}