package mx.iteso.adapter.googledocs;
import mx.iteso.adapter.BackgroundImage;
import java.awt.Font;

public interface IGoogleDoc {
     Font getFont();
     Object getStyle();
     BackgroundImage getBackground();
     void setSharingPermissions(int SharingPermissions);
     int getSharingPermissions();
}

