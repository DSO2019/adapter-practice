from Image import *


class BackgroundImage():

    def __init__(self, image=None):
        if image is None:
            self.image = Image('someurl.jpg')
        else:
            self.image = image

    def get_image(self):
        return self.image
