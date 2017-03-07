package nPrimo;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.*;

public class Primo extends MIDlet implements CommandListener {
	
	private Display display;
	private Form form = new Form("Introduce un numero entero");
	private Command submit = new Command("Submit",Command.SCREEN,1);
	private Command exit = new Command("Exit",Command.SCREEN,2);
    private TextField textfield = new TextField("Numero:","",10,TextField.NUMERIC);
    private Alert alert = new Alert("Alerta", "Mensaje de alerta", null, AlertType.ERROR);
    private String string;
    private List list;
	public Primo() {
		display = Display.getDisplay(this);
		form.addCommand(exit);
		form.addCommand(submit);
		form.append(textfield);
		form.setCommandListener(this);
		alert.setTimeout(Alert.FOREVER);
		String [] string = {"America","Europa","Asia"};
		List list = new List ("Continentes:",List.EXCLUSIVE,string,null);
		alert.setString(list.getString(1));
	}

	protected void startApp() throws MIDletStateChangeException {
		display.setCurrent(form);
		display.setCurrent(alert);
	}
	
	protected void destroyApp(boolean unconditional) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}
	
	public void commandAction(Command command, Displayable displayable) {
	    if (command == submit) {
	      textfield.setString("Hello, " + textfield.getString());
	      form.removeCommand(submit);
	    } else if (command == exit) {
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
