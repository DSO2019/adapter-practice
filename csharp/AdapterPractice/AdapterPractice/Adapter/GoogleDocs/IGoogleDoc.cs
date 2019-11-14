using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter.GoogleDocs
{
    public interface IGoogleDoc
    {

        Font getFont();


        Format getStyle();


        BackgroundImage getBackground();


        void setSharingPermissions(int sharingPermissions);


        int getSharingPermissions();
    }
}
