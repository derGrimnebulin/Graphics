
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Nick implements Sprite {
	private static String path = "32871930.jpg";
	private int width;
	private int height;
	private BufferedImage img;
	
	public Nick() throws IOException{
		img = ImageIO.read(new File(path));
		width = img.getWidth();
		height = img.getHeight();
	}

	@Override
	public void draw(Graphics surface, int x, int y) {
    //((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    surface.drawImage(
    		img ,
    		x,y, x+width, y+height,
    		0,0, width, height,
    		null
    );
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
