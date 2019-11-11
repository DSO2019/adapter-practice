from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *


class WordDocument(IWordDocument):

    def __init__(self, licenseNum):
        self.license = MSLicense(licenseNum)
        self.format = Format()
        self.background = Image("image.png")

    def getFormat(self):
        return self.format

    def setFormat(self, selectedFormat):
        self.format = selectedFormat

    def getBackground(self):
        return self.background

    def setBackground(self, img):
        self.background = img

    def getMSOfficeVersion(self):
        return self.msOfficeVersion

    def setMSOfficeVersion(self, newMsOfficeVersion):
        self.msOfficeVersion = newMsOfficeVersion

    def getLicense(self):
        return self.license

    def setLicense(self, license):
        self.license = license

    def restrictEditIfLicenseIsInvalid(self, msLicense):
        return not(self.license.isValid())
