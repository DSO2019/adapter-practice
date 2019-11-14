from IGoogleDoc import *
from Format import *
from BackgroundImage import *
from Font import *


class GoogleDocument(IGoogleDoc):

    def __init__(self):
        self.style = Format()
        self.font = self.style.get_font()
        self.background = BackgroundImage()
        self.sharing_permissions = 1

    def get_font(self):
        return self.font

    def get_style(self):
        return self.style

    def get_background(self):
        return self.background

    def set_sharing_permissions(self, sharing_permissions):
        self.sharing_permissions = sharing_permissions

    def get_sharing_permissions(self):
        return self.sharing_permissions
