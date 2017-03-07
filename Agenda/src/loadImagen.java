import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;

public class loadImagen extends Canvas {
	
	private Image image;
	private int   centerX;
	private int   centerY;
	private int color;
	
	public loadImagen (String source) {
		
		try {
			this.image = Image.createImage(source);
			this.centerX = (this.getWidth() - this.image.getWidth())/2;
			this.centerY = (this.getHeight() - this.image.getHeight())/2;
			
		} catch (IOException e){
			
		}
		
	}
	
	public void show(final Display display) {
		display.setCurrent(this);
	}
	
	protected void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(0x00, 0x00, getWidth(), getHeight());

		if (this.image != null) {
			g.drawImage(this.image, this.centerX, this.centerY, 0x00);
		}
	}
	
	

}
