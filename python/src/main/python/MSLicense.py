
class MSLicense():
    def __init__(self, version):
        self.version = version
        if nVersion <= 12.0:
            self.supported = "Old version, no support"
        elif nVersion > 12.0 and nVersion <= 16.0:
            self.supported = "Older version, still supported"
        elif (nVersion > 16.0):
            self.supported = "Current stable version"
        else :
            self.supported = "Invalid License"
    
    
    def getVersion(self):
        return self.version
    
    def isSupported(self):
        return self.supported
