from abc import ABC

class IWordDocument(ABC):
    def getFormat(self):
        pass

    def getBackground(self):
        pass

    def setMSOfficeVersion(self, msOfficeVersion):
        pass

    def getLicense(self):
        pass

    def restrictEditIfLicenseIsInvalid(self, msLicense):
        pass