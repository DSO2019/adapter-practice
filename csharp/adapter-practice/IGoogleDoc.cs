using System;


namespace adapter_practice
{
    public interface IGoogleDoc
    {
      
        Font GetFont();
        
        Object GetStyle();
       
        BackgroundImg GetBackground();
       
        void SetSharingPermissions(int sharingPermissions);
    }
}
