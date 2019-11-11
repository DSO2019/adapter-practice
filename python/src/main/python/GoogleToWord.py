from Font import *
from IGoogleDoc import *
from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *


class GoogleToWord (IWordDocument):
    def __init__(self, incomingGoogleDoc):
        self.googleDoc = incomingGoogleDoc

    def getFont(self):
        return self.googleDoc.getFont()

    def getFormat(self):
        return self.googleDoc.getStyle()

    def getBackground(self):
        return self.googleDoc.getBackground().getImage()

    def setMSOfficeVersion(self, msOfficeVersion):
        return

    def getLicense(self):
        validNumber = 10001
        invalidNumber = 1
        if (self.googleDoc.getSharingPermissions() == 1):
            return MSLicense(validNumber)
        else:
            return MSLicense(invalidNumber)

    def restrictEditIfLicenseIsInvalid(self, msLicense):
        return not(msLicense.isValid())
