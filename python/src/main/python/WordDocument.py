from IWordDocument import *
from Format import *
from Image import *
from License import *


class WordDocument(IWordDocument):

    def __init__(self, ms_license_number):
        self.ms_license = MSLicense(ms_license_number)
        self.format = Format()
        self.background = Image('ExampleImage.jpg')

    def get_format(self):
        return self.format

    def getBackground(self):
        return self.background

    def getOfficeVersion(self):
        return self.ms_office_version

    def setMsOffice(self, ms_office_version):
        self.ms_office_version = ms_office_version

    def getOfficeLicense(self):
        return self.ms_license

    def licenceInvalidCannotEdit(self):
        return not(self.ms_license.validLicence())
