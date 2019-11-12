from abc import ABC, abstractmethod

class IGoogleDoc(ABC):

    @abstractmethod
    def getFont(self):
        pass

    @abstractmethod
    def getStyle(self):
        pass
    
    @abstractmethod
    def getBackground(self):
        pass

    @abstractmethod
    def setSharingPermissions(self, sharing_permissions):
        pass

    @abstractmethod
    def getSharingPermissions(self):
        pass