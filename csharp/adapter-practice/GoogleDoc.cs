using System;


namespace adapter_practice
{
    public class GoogleDoc:IGoogleDoc
    {
   
    private int _sharingPermissions;
    
    private readonly Font _font;
   
    private readonly Format _style;
    
    private readonly BackgroundImg _backgroundImage;
    
    public GoogleDoc()
    {
        this._font = new Font("Verdana");
        this._backgroundImage = new BackgroundImg(new Img("SoyUnaUrl"));
        this._style = new Format(this._font, "Regular");
        this._sharingPermissions = 1;
    }
    
    public Font GetFont()
    {
        return this._font;
    }
  
    public  Object GetStyle()
    {
        return this._style;
    }
   
    public BackgroundImg GetBackground()
    {
        return this._backgroundImage;
    }
    public void SetSharingPermissions(int sharingPerm)
    {
        this._sharingPermissions = sharingPerm;
    }
    }
}
