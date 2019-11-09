package mx.iteso.adapter;

import mx.iteso.adapter.Image;

public class BackgroundImage {
    private Image img;

    public BackgroundImage(Image imgBck){
        this.img = imgBck;
    }

    public Image getImage(){
        return this.img;
    }
}