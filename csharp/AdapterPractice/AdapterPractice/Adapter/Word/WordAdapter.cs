using System;
using System.Collections.Generic;
using System.Text;
using AdapterPractice.Adapter.GoogleDocs;

namespace AdapterPractice.Adapter.Word
{
    public class WordAdapter : IGoogleDoc{

   
    private IWordDocument wordDocument;


    public WordAdapter(WordDocument newWordDoc)
    {
        this.wordDocument = newWordDoc;
    }


    public Font getFont()
    {
        return this.wordDocument.getFormat().getFont();
    }


    public Format getStyle()
    {
        return this.wordDocument.getFormat();
    }

    public BackgroundImage getBackground()
    {
        return new BackgroundImage(this.wordDocument.getBackground());
    }

    public void setSharingPermissions(int sharingPermissions)
    {
        return;
    }


    public int getSharingPermissions()
    {
        return this.wordDocument.restrictEditIfLicenseIsInvalid() ? 0 : 1;
    }
    }

}
