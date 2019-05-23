import java.util.List;
import java.util.ArrayList;

/** Classe invocadora */
public class Switch {
   private List<Command> history = new ArrayList<Command>();

   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();
   }
}

