from IGoogleDoc import *
from Format import *
from BackgroundImage import *
from Font import *


class GoogleDoc(IGoogleDoc):

    def __init__(self):
        self.font = Font("Timesroman", 12)
        self.style = Font("Arial", 12)
        self.backgroundImage = BackgroundImage("image", 1024.0, 720.0)
        self.sharingPermissions = 1

    def getFont(self):
        return self.font

    def getStyle(self):
        return self.style

    def getBackground(self):
        return self.backgroundImage

    def getSharingPermissions(self):
        return self.sharingPermissions

    def setSharingPermissions(self, sharingPermissions2):
        self.sharingPermissions = sharingPermissions2
