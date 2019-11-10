from Image import *


class BackgroundImage():

    def __init__(self, img=None):
        if(img not None):
            self.image = img
        else:
            self.image = Image("image.png")

    def getImage(self):
        return self.image
