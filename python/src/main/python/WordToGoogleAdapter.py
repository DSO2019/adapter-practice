from IGoogleDoc import *
from BackgroundImage import *


class WordToGoogleAdapter(IGoogleDoc):

    def __init__(self, word):
        self.worddoc = word
        self.bckImg = BackgroundImage(self.worddoc.getBackground())
        self.validLicense = self.worddoc.getLicense().getNumber()

    def getFont(self):
        return self.worddoc.getFormat().getFont()

    def getStyle(self):
        return self.worddoc.getFormat()

    def getBackground(self):
        return self.bckImg

    def setSharingPermissions(self, sharing_permissions):
        if (sharing_permissions == 0):
            self.validLicense = 0
        else:
            self.validLicense = 10001

    def getSharingPermissions(self):
        if (self.validLicense > 10000):
            return 1
        return 0
