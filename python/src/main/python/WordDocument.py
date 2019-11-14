from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *


class WordDocument(IWordDocument):

    def __init__(self):
        self.license = MSLicense(16.0)
        self.format = Format("Arial", 12)
        self.image = Image("image", 1024.0, 720.0)

    def getFormat(self):
        return self.format

    def getBackground(self):
        return self.background

    def setBackground(self, img):
        self.background = img

    def setMSOfficeVersion(self, newMsOfficeVersion):
        self.msOfficeVersion = newMsOfficeVersion
        self.license = MSLicense(msOfficeVersion)

    def getLicense(self):
        return self.license

    def restrictEditIfLicenseIsInvalid(self, msLicense):
        this.license = msLicense
        return not(self.license.isValid())