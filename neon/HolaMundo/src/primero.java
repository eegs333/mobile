import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author eegs333
 */
public class primero extends MIDlet implements CommandListener {
    
    Command c;
    Display d;
    Form f;
    int x,y,z;
    StringItem si;
    
    public primero(){
    
        x = 2;
        y = 3;
        z = x + y;
        
        d = Display.getDisplay(this);
        c = new Command("Salir",Command.EXIT,2);
        f = new Form("primero");
        si = new StringItem("","Hola Mundo Cruel!");
        f.append(si);
        f.addCommand(c);
        f.setCommandListener(this);
        
    }
    
    public void startApp() throws MIDletStateChangeException {
        d.setCurrent(f);
     
    }
    
    public void destroyApp(boolean b) {
    }

    public void commandAction(Command co, Displayable d) {
        if (co == c) {
            destroyApp(false);
           notifyDestroyed();
        }
    }

	protected void pauseApp() {
		// TODO Auto-generated method stub
		
	}
}
