package fr.upem.robot.servant;

import fr.upem.robot.Position;
import fr.upem.robot.RobotControlOperations;
import org.omg.CORBA.Any;

public class RobotControlImpl implements RobotControlOperations {

    @Override
    public Position maxPosition() {
        return null;
    }

    @Override
    public void maxPosition(Position arg) {

    }

    @Override
    public Any getSensor(String sensor) {
        return null;
    }

    @Override
    public boolean setSensor(String sensor, Any newSensor) {
        return false;
    }

    @Override
    public Any[] getSensors() {
        return new Any[0];
    }
}
