
package cammandp;

import javafx.scene.effect.Light;

public class CammandP {

   
    
        public static void main(String[] args) {
        Light light = new Light();
        Command[] Commands = {
            new LightOnCommand(light),
            new LightOffCommand(light)
        };
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(Commands);
        
        simpleRemoteControl.buttonWasPressed(0); 
        simpleRemoteControl.buttonWasPressed(1); 
        
        
            System.out.println("Nasratullah");
            System.out.println("Basir ahmad");
            System.out.println("Samiullah");
            


    }
    }
    









