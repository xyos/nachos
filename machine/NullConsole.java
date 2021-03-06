// PART OF THE MACHINE SIMULATION. DO NOT CHANGE.

package nachos.machine;

import nachos.security.Privilege;

/**
 * A null console device.
 */
public class NullConsole implements SerialConsole {
    public void init(Privilege privilege) {
    }

    public void setInterruptHandlers(Runnable receiveInterruptHandler,
                                     Runnable sendInterruptHandler) {
    }

    public int readByte() {
        return -1;
    }

    public void writeByte(int value) {
    }
}
