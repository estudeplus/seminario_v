/** O Command para desligar a luz - ConcreteCommand #2 */
public class OutCommand implements Command {
   private Light theLight;
   private String thePlace;
   private Door theDoor;

   public OutCommand(Light light, String place, Door door) {
      this.theLight = light;
      this.thePlace = place;
      this.theDoor = door;
   }

   @Override    // Command
   public void execute() {
      theLight.turnOff(thePlace);
      theDoor.closeDoor(thePlace);
   }
}
