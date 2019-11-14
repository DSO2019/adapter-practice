using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter.GoogleDocs
{
    public class GoogleDoc : IGoogleDoc {

    private Font font;

    private Format format;

    private BackgroundImage backgroundImage;

    private int sharingPermissions;


    public Font getFont()
    {
        return this.font;
    }


    public Format getStyle()
    {
        return this.format;
    }

    public Format getFormat()
    {
        return this.format;
    }

    public BackgroundImage getBackground()
    {
        return this.backgroundImage;
    }

    public void setSharingPermissions(int incomingSharingPermissions)
    {
        this.sharingPermissions = incomingSharingPermissions;
    }

    public int getSharingPermissions()
    {
        return 0;
    }
    }

}
