import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class agenda extends MIDlet implements CommandListener {
	
	private Display display;
	private loadImagen Imagen;
	private Command exit;

	public agenda() {
		// TODO Auto-generated constructor stub
		this.display = Display.getDisplay(this);
		this.Imagen = new loadImagen("/cthulhu.png");
	}

	protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		this.exit = new Command("Exit", Command.EXIT, 0x01);
		
		Displayable main = this.getMainScreen();
		main.setCommandListener(this);
		main.addCommand(this.exit);
		
		this.Imagen.show(this.display);

	}
	
	private Displayable getMainScreen() {
		//TODO: Implement the main screen here.
		return new Canvas() {
			protected void paint(Graphics g) {
			}
		};
	}
	
	public void commandAction(Command command, Displayable displayable) {
		if (command == this.exit) {
			try {
				this.destroyApp(true);
			} catch (MIDletStateChangeException e) {
				e.printStackTrace();
			} finally {				
				this.notifyDestroyed();
			}
		}
	}	

}
