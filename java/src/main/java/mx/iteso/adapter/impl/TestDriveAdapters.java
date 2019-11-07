package mx.iteso.adapter.impl;

import mx.iteso.adapter.impl.adapter.DocsAdapter;
import mx.iteso.adapter.impl.document.GoogleDoc;
import mx.iteso.adapter.impl.document.WordDoc;
import mx.iteso.adapter.impl.ints.IGoogleDoc;
import mx.iteso.adapter.impl.ints.IWordDocument;
import mx.iteso.adapter.impl.other.MSLicense;
import mx.iteso.adapter.impl.other.Image;

public class TestDriveAdapters {

    public static void main(String [] args){
        IWordDocument wd = new WordDoc();
        IGoogleDoc gd = new GoogleDoc();

        IWordDocument convertedToWD = new DocsAdapter(gd);

        Object format;
        Image background;
        MSLicense license;
        boolean edit;
        //Word Document
        format = wd.getFormat();
        background = wd.getBackground();
        license = wd.getLicense();
        edit = wd.restrictEditIfLicenseIsInvalid(license);
        wd.setMSOfficeVersion(452);
        //Converted GD to WD
        format = convertedToWD.getFormat();
        background = convertedToWD.getBackground();
        license = convertedToWD.getLicense();
        edit = convertedToWD.restrictEditIfLicenseIsInvalid(license);
        convertedToWD.setMSOfficeVersion(612);

    }
}