import abc


class IGoogleDoc:

    def getFont(self):
        pass

    def getStyle(self):
        pass

    def getBackground(self):
        pass

    def setPermissions(self, sharing_permissions):
        pass

    def getPermissions(self):
        pass
