from Font import *
from IGoogleDoc import *
from IWordDocument import *
from Format import *
from Image import *
from License import *


class GoogleAdapter(IWordDocument):

    def __init__(self, googleDocument):
        self.googleDocument = googleDocument

    def get_format(self):
        return self.googleDocument.getStyle()

    def getBackground(self):
        return self.googleDocument.getBackground().getImage()

    def setMsOffice(self, ms_office_version):
        return

    def getOfficeLicense(self):
        if self.googleDocument.getPermissions() == 1:
            return MSLicense(1)
        return MSLicense(-1)

    def licenceInvalidCannotEdit(self):
        return
