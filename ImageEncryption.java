mport java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageEncryption {

    public static void main(String[] args) {
        try {

            // Load input image
            File inputFile = new File("input.png");
            BufferedImage image = ImageIO.read(inputFile);

            int width = image.getWidth();
            int height = image.getHeight();

            int key = 50;   // Encryption key

            // Loop through each pixel
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {

                    int pixel = image.getRGB(x, y);

                    int a = (pixel >> 24) & 0xff;
                    int r = (pixel >> 16) & 0xff;
                    int g = (pixel >> 8) & 0xff;
                    int b = pixel & 0xff;

                    // Encrypt RGB values
                    r = (r + key) % 256;
                    g = (g + key) % 256;
                    b = (b + key) % 256;

                    int newPixel = (a << 24) | (r << 16) | (g << 8) | b;

                    image.setRGB(x, y, newPixel);
                }
            }

            // Save encrypted image
            File outputFile = new File("encrypted.png");
            ImageIO.write(image, "png", outputFile);

            System.out.println("Image encrypted successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
