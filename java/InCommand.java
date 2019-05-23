/** O Command para ligar a luz - ConcreteCommand #1 */
public class InCommand implements Command {
   private Light theLight;
   private String thePlace;
   private Door theDoor;

   public InCommand(Light light, String place, Door door) {
      this.theLight = light;
      this.thePlace = place;
      this.theDoor = door;  
    }

   @Override    // Command
   public void execute() {
      theLight.turnOn(thePlace);
      theDoor.openDoor(thePlace);

   }
}
