

namespace adapter_practice
{
    public class BackgroundImg
    {
        private readonly Img _image;
       
        public BackgroundImg(Img img)
        {
            this._image = img;
        }
       
       public Img GetImage()
        {
            return this._image;
        }
    }
}
