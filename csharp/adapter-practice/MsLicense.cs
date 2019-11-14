using System;


namespace adapter_practice
{
    public class MsLicense
    {
   
        private readonly String _license;
        public MsLicense(String licen)
        {
            this._license = licen;
        }
        public String GetLicense()
        {
            return this._license;
        }
    }
}
