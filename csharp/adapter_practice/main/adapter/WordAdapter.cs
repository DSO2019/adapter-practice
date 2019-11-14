using adapter_practice.main.ints;
using adapter_practice.main.other;
using System;
using System.Collections.Generic;
using System.Text;

namespace adapter_practice.main.adapter
{
    public class WordAdapter : IGoogleDoc
    {
        /**
         * Word document.
         */
        private IWordDocument wordDocument;
        /**
         *
         * @param wordDocument1 constructor.
         */
        public WordAdapter(IWordDocument wordDocument1)
        {
            this.wordDocument = wordDocument1;
        }
        /**
         * @return font.
         */
        public Font getFont()
        {
            Console.WriteLine("Google's default font is Arial");
            return null;
        }
        /**
         * @return Object of style.
         */
        public Object getStyle()
        {
            return (Object)this.wordDocument.getFormat();
        }
        /**
         * @return Background image.
         */
        public BackgroundImage getBackground()
        {
            Object background = this.wordDocument.getBackground();
            return (BackgroundImage)background;
        }
        /**
         * @param sharingPermissions sharing permissions.
         */
        public void setSharingPermissions(int sharingPermissions)
        {
            this.wordDocument.setMSOfficeVersion((float)sharingPermissions);
        }
    }
}
