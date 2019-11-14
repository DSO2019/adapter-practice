using adapter_practice.main.ints;
using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.document
{
    public class GoogleDoc : IGoogleDoc {
    /**
     * Font.
     */
    private Font font;
    /**
     * Style.
     */
    private Object style;
    /**
     * Background image.
     */
    private BackgroundImage bi;
    /**
     * Magic number.
     */
    public static int FONT_SIZE = 11;
    /**
     * Constructor.
     */
    public GoogleDoc()
    {
        font = new Font("Arial", 0, FONT_SIZE);
        style = new Object();
        bi = new BackgroundImage();
    }
    /**
     * @return Font.
     */
    public Font getFont()
    {
        Console.WriteLine("Font is " + font.getName() + " " + font.getSize());
        return font;
    }
    /**
     * @return object of style.
     */
    public Object getStyle()
    {
        Console.WriteLine("Google");
        return style;
    }
    /**
     * @return background image.
     */
    public BackgroundImage getBackground()
    {
        Console.WriteLine("BackgroundImage from Google");
        return bi;
    }
    /**
     * @param sharingPermissions sharing permissions.
     */
    public void setSharingPermissions(int sharingPermissions)
    {
        if (sharingPermissions == 0)
        {
            Console.WriteLine("Sharing permissions are not enabled");
        }
        else
        {
            Console.WriteLine("Sharing permissions enabled");
        }
    }
}
}
