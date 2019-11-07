package mx.iteso.beans;

public class Image{
    private String url;

    public Image(String incomingUrl){
        this.url = incomingUrl;
    }

    public String getUrl(){
        return this.url;
    }

}