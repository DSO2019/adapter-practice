package mx.iteso.adapter;

import java.awt.*;
import mx.iteso.interfaces.*;
import mx.iteso.beans.Format;
import mx.iteso.beans.BackgroundImage;

public class WordToGoogle implements IGoogleDoc{

    IWordDocument wordDocument;
    public Font getFont(){
        return wordDocument.getFormat().getFont();
    }

    public Format getStyle(){
        return wordDocument.getFormat();
    }

    public BackgroundImage getBackground(){
        return new BackgroundImage(wordDocument.getBackground());
    }
    
    public void setSharingPermissions(int sharedPermissionNumber){
        return;
    }

    public int getSharingPermissions(){
        if(wordDocument.restrictEditIfLicenseIsInvalid(wordDocument.getLicense())){
            return 0;
        }else{
            return 1;
        }
    }
}

