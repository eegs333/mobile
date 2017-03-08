package cuadromagico;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author eegs333
 */
public class Midlet extends MIDlet implements CommandListener {

    TextField tf;
    Command c, c2;
    Form f;
    
    public Midlet(){
    
        tf = new TextField("Tamaño: ","",5,TextField.ANY);
        f = new Form (""); 
        c = new Command("otro",Command.OK,1);
        c2 = new Command("Mostrar",Command.OK,1);
        f.addCommand(c);
        f.addCommand(c2);
        
    }
    
    public void startApp() {
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
