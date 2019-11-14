using System;
using System.Collections.Generic;
using System.Text;

namespace AdapterPractice.Adapter
{
    public class BackgroundImage
    {
      
        private Image image;

        public BackgroundImage( Image background)
        {
            this.image = new Image("image.jpg");
        }

        public Image getImage()
        {
            return this.image;
        }
    }
}
