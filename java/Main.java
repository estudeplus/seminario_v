import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/* Classe teste */
public class House {
   public static void main(String[] args){

      Light lamp = new Light();
      Door door = new Door();
      Command inBathroom = new InCommand(lamp, "banheiro" , door);
      Command outBathroom = new OutCommand(lamp, "banheiro" , door);
      Command inBedroom = new InCommand(lamp, "quarto" , door);
      Command outBedroom = new OutCommand(lamp, "quarto" , door);
      Command inLivingRoom = new InCommand(lamp, "sala" , door);
      Command outLivingRoom = new OutCommand(lamp, "sala" , door);
      Command inKitchen = new InCommand(lamp, "cozinha" , door);
      Command outKitchen = new OutCommand(lamp, "cozinha" , door);

      Switch mySwitch = new Switch();
      Command current;
      int first = 0;
      List<String> places = new ArrayList<String>();
      places.add("");
      places.add("1 - ir ao banheiro \n");
      places.add("2 - ir ao quarto \n");
      places.add("3 - ir a sala \n");
      places.add("4 - ir a cozinha \n");
      
      do{
        System.out.println("Escolha um local para ir ou digite -1 para sair");
        for(int i = 0; i < places.size(); i++){
            if(i == first){
                continue;
            }
            System.out.println(places.get(i));
        }
        do{
            Scanner reader = new Scanner(System.in);
            int destiny = reader.nextInt();
        }while(destiny == first);

        switch(destiny) {
        case 1:
            if(first != 0){
                mySwitch.storeAndExecute(current);
            }
            mySwitch.storeAndExecute(inBathroom);
            current = outBathroom;
            break;
        case 2:
            if(first != 0){
                mySwitch.storeAndExecute(current);
            }
            mySwitch.storeAndExecute(inBedroom);
            current = outBedroom;
            break;
        case 3:
            if(first != 0){
                mySwitch.storeAndExecute(current);
            }
            mySwitch.storeAndExecute(inLivingRoom);
            current = outLivingRoom;
            break;
        case 4:
            if(first != 0){
                mySwitch.storeAndExecute(current);
            }
            mySwitch.storeAndExecute(inKitchen);
            current = outKitchen;
            break;
        default:
            
        }
        first = destiny;
      }while((destiny > 0) && (destiny < 5));

      
   }
}