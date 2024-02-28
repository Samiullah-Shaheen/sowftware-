
package cammandp;

public class SimpleRemoteControl {
    Command[] slots;

    public SimpleRemoteControl(Command[] slots) {
        this.slots = slots;
    }

    public void buttonWasPressed(int slotIndex) {
        if (slotIndex >= 0 && slotIndex < slots.length) {
            slots[slotIndex].execute();
        }
    }
}