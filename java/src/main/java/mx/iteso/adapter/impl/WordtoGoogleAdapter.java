package mx.iteso.adapter;

import mx.iteso.adapter.WordDoc;
import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.Format;
import java.awt.*;

public class WordtoGoogleAdapter implements IGoogleDoc {
    WordDoc worddoc;
    BackgroundImage bckImg;

    public WordtoGoogleAdapter(WordDoc word){
        this.worddoc = word;
        this.bckImg = new BackgroundImage(word.getBackground());
    }

    public Font getFont(){
        Format temp = this.worddoc.getFormat();
        return temp.getFont();
    };

    public Format getStyle(){
        return this.worddoc.getFormat();
    }

    public BackgroundImage getBackground(){
        return this.bckImg;
    };

    public void setSharingPermissions(int SharingPermissions){
        return;
    };
    public int getSharingPermissions(){
        if(this.worddoc.getLicense().getNumber()  > 10000){
            return 1;
        }
        return 0;
    }

}