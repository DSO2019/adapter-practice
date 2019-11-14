using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter
{
    public class Font
    {
        private readonly string font;

        public Font(string font)
        {
            font = font;
        }

        public string GetFont()
        {
            return font;
        }
    }
}
