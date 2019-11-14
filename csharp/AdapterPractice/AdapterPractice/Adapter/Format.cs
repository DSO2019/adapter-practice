using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter
{
    public class Format
    {
       
        private Font font;

       
        public Format()
        {
            int fontSize = 20;
            this.font = new Font("Arial");
        }

       
        public Font getFont()
        {
            return font;
        }
    }
}
