package mx.iteso.adapter.word;

import mx.iteso.adapter.Format;
import mx.iteso.adapter.Image;

/**
 * Word Doc.
 */
public interface IWordDocument {
     /**
      *
      * @return format.
      */
     Format getFormat();

     /**
      *
      * @return background.
      */
     Image getBackground();

     /**
      *
      * @param msOfficeVersion .
      */
     void setMSOfficeVersion(float msOfficeVersion);

     /**
      *
      * @return license.
      */
     MSLicense getLicense();

     /**
      *
      * @return is invalid falseee.
      */
     boolean restrictEditIfLicenseIsInvalid();

}
