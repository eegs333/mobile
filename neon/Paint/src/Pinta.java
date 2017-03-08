import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

class Pinta extends Canvas {
	  public void paint (Graphics g){
	      g.setColor (255,0,255);
	      g.fillRect(0,0,getWidth(),getHeight());
	  }
	}