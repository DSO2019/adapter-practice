
from Format import *
from MSLicense import *
from Image import *

class WordDocumentt():

    def __init__(self, lsc_number):
        self.format = Format()
        self.img = Image("diseño.png")

    def getFormat(self):
        return self.format

    def getBackground(self):
        return self.img

    def setMSOfficeVersion(self, msOfficeversion):
        self.version = msOfficeversion
        
    def restrictEditIfLicenseIsInvalid(self, ms_license):
        if (ms_license.getNumber() > 80):
            return False
        return True
