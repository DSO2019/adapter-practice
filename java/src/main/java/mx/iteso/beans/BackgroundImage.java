package mx.iteso.beans;

public class BackgroundImage{
    private Image image;

    public BackgroundImage(){
        this.image = new Image("image.png");
    }

    public BackgroundImage(Image img){
        this.image = img;
    }

    public Image getImage(){
        return this.image;
    }

}