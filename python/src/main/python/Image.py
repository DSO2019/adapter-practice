
class Image():
    def __init__(self, path, width, height):
        self.path = path
        self.width = width
        self.height = height
    
    def getPath(self):
        return self.path
    
    def getWidth(self):
        return self.width
    
    def getHeight(self):
        return self.height