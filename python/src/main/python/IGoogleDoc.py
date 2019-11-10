from abc import ABC


class IGoogleDoc(ABC):

    def getFont(self):
        pass

    def getStyle(self):
        pass

    def getBackground(self):
        pass

    def setSharingPermissions(self, incomingSharingPermission):
        pass

    def getSharingPermissions(self):
        pass
