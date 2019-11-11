from Image import *


class BackgroundImage():

    def __init__(self, img=None):
        if img is None:
            self.image = Image("image.png")
        else:
            self.image = img

    def getImage(self):
        return self.image
