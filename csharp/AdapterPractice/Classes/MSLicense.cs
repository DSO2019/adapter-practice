namespace AdapterPractice.Classes
{
    public class MsLicense {

        private readonly string _license;

        public MsLicense(string lic) {
            _license = lic;
        }

        public string GetLicense() {
            return _license;
        }
    }
}