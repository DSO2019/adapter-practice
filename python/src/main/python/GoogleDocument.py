from IGoogleDoc import *
from Format import *
from BackImage import *
from Font import *


class GoogleDocument(IGoogleDoc):

    def __init__(self):
        self.style = Format()
        self.font = self.style.getFont()
        self.background = BackgroundImage()
        self.sharing_permissions = 1

    def getBackground(self):
        return self.background

    def setPermissions(self, sharing_permissions):
        self.sharing_permissions = sharing_permissions

    def getPermissions(self):
        return self.sharing_permissions

    def getFont(self):
        return self.font

    def getStyle(self):
        return self.style

