from Image import *


class BackgroundImage():

    def __init__(self, image=None):
        if image is None:
            self.image = Image('ExampleImage.jpg')
        else:
            self.image = image

    def getImage(self):
        return self.image
