from IGoogleDoc import *
from IWordDocument import *
from Format import *
from MSLicense import *
from BackgroundImage import *


class WordToGoogle(IGoogleDoc):
    def __init__(self, incomingWordDoc):
        self.wordDocument = incomingWordDoc

    def getFont(self):
        return self.wordDocument.getFormat().getFont()

    def getStyle(self):
        return self.wordDocument.getFormat()

    def getBackground(self):
        return BackgroundImage(self.wordDocument.getBackground())

    def setSharingPermissions(self, sharedPermissionNumber):
        return

    def getSharingPermissions(self):
        license = self.wordDocument.getLicense()
        if (self.wordDocument.restrictEditIfLicenseIsInvalid(license)):
            return 0
        else:
            return 1
