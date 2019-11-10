from IGoogleDoc import *
from Format import *
from BackgroundImage import *
from Font import *


class GoogleDoc(IGoogleDoc):

    def __init__(self):
        self.sharingPermission = 1
        self.style = Format()
        self.font = self.style.getFont()
        self.backgroundImage = BackgroundImage()
        self.sharingPermissions = sharingPermission

    def getFont(self):
        return self.font

    def getStyle(self):
        return self.style

    def getBackground(self):
        return self.backgroundImage

    def setSharingPermissions(self, incomingSharingPermission):
        self.sharingPermissions = incomingSharingPermission

    def getSharingPermissions(self):
        return self.sharingPermissions
