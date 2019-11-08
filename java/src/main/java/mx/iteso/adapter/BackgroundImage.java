package mx.iteso.adapter;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Imagen
 */
public class BackgroundImage {
    private Image image;

    public BackgroundImage() {
        this.image = new Image() {
            public int getWidth(ImageObserver imageObserver) {
                return 0;
            }

            public int getHeight(ImageObserver imageObserver) {
                return 0;
            }

            public ImageProducer getSource() {
                return null;
            }

            public Graphics getGraphics() {
                return null;
            }

            public Object getProperty(String s, ImageObserver imageObserver) {
                return null;
            }
        };
    }

    public BackgroundImage(Image imagenArg) {
        image = imagenArg;
    }

    public Image getImage() {
        return this.image;
    }
}
