import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.*;

public class MiPaint extends MIDlet implements CommandListener {
	
	  Command c;
	  Display d;
	  Pinta p;

	public MiPaint() {
		// TODO Auto-generated constructor stub
	    d = Display.getDisplay(this);
	    c = new Command("Salir", Command.SCREEN,2);
	    p = new Pinta();
	    p.addCommand(c);
	    p.setCommandListener(this);
	    
	}

	protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
	    d.setCurrent(p);
	}
	
	  public void commandAction(Command co, Displayable di){
		    if (co==c){
		      try {
				destroyApp(false);
			} catch (MIDletStateChangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      notifyDestroyed();
		    }
		  }

}
