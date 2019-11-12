from IWordDocument import *
from Format import *
from Image import *
from MSLicense import *

class WordDoc(IWordDocument):

    def __init__(self, lsc_number):
        self.format = Format()
        self.img = Image("img.png")
        self.license = MSLicense(lsc_number)
        self.version = 1.1
    
     
    def getFormat(self):
        return self.format

    
    def getBackground(self):
        return self.img

    
    def setMSOfficeVersion(self, ms_office_version):
        self.version = ms_office_version

    
    def getLicense(self):
        return self.license

    
    def restrictEditIfLicenseIsInvalid(self, ms_license):
        if (ms_license.getNumber() > 10000):
            return False
        return True