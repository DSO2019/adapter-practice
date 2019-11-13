
from IWordDocument import *
from MSLicense import *


class GoogleToWordAdapter(IWordDocument):

    def __init__(self, google):
        self.googledoc = google

    def getFormat(self):
        return self.googledoc.getStyle()

    def getBackground(self):
        return self.googledoc.getBackground().getImage()

    def setMSOfficeVersion(self, ms_office_version):
        pass

    def getLicense(self):
        if (self.googledoc.getSharingPermissions() == 1):
            return MSLicense(10001)
        return MSLicense(0)

    def restrictEditIfLicenseIsInvalid(self, ms_license):
        if (ms_license.getNumber() > 10000):
            return False
        return True
