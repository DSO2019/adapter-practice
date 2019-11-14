using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter
{
    public class Image
    {
      
        private String url;

      
        public Image(String newUrl)
        {
            this.url = newUrl;
        }

        public String getUrl()
        {
            return this.url;
        }
    }
}
