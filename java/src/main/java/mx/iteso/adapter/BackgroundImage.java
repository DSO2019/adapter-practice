package mx.iteso.adapter;


import java.awt.*;

public class BackgroundImage {
    private Image image;

    public BackgroundImage(final float alto, final float ancho){
        this.image = new Image("image.jpg");
    }

    public BackgroundImage(final Image img){
        this.image = img;
    }

    public Image getImage(){
        return this.image;
    }
}
