from IGoogleDoc import *
from Format import * 
from BackgroundImage import *
from Image import *

class GoogleDoc(IGoogleDoc):

    def __init__(self):
        self.style = Format()
        self.font = self.style.getFont()
        self.bckImage = BackgroundImage(Image("img.png"))
        self.shrPermissions = 1
    
    def getFont(self):
        return self.font
    
    def getStyle(self):
        return self.style
    
    def getBackground(self):
        return self.bckImage
    
    def setSharingPermissions(self, sharing_permissions):
        self.shrPermissions = sharing_permissions
    
    def getSharingPermissions(self):
        return self.shrPermissions