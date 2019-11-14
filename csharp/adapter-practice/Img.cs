using System;

namespace adapter_practice
{
    public class Img
    {

        private readonly String _url;

        public Img(String ur)
        {
            this._url = ur;
        }

        public String GetUrl()
        {
            return this._url;
        }
    }

}

