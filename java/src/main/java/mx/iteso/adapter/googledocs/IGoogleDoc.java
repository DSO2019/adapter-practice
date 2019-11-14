package mx.iteso.adapter.googledocs;
import mx.iteso.adapter.BackgroundImage;
import mx.iteso.adapter.Format;

import java.awt.Font;

/**
 * New google Doc.
 */
public interface IGoogleDoc {

     /**
      *
      * @return Font.
      */
     Font getFont();

     /**
      *
      * @return style.
      */
     Format getStyle();

     /**
      *
      * @return background.
      */
     BackgroundImage getBackground();

     /**
      *
      * @param sharingPermissions .
      */
     void setSharingPermissions(int sharingPermissions);

     /**
      *
      * @return sharingpermissions falseee.
      */
     int getSharingPermissions();
}

