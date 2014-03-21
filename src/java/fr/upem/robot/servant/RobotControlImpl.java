package fr.upem.robot.servant;

import fr.upem.robot.Position;
import fr.upem.robot.Reject;
import fr.upem.robot.RobotControlOperations;
import org.omg.CORBA.Any;

import java.util.concurrent.ConcurrentHashMap;

public class RobotControlImpl implements RobotControlOperations {

    private Position maxPosition;
    private ConcurrentHashMap<String, Any> sensors = null;

    public RobotControlImpl() {
        this.sensors = new ConcurrentHashMap<String, Any>();
    }

    @Override
    public Position maxPosition() {
        return maxPosition;
    }

    @Override
    public void maxPosition(Position arg) {
        maxPosition = arg;
    }

    @Override
    public Any getSensor(String sensor) throws Reject {
        if (!sensors.containsKey(sensor)) {
            throw new Reject("Sensor " + sensor + " didn't exist !");
        }
        return sensors.get(sensor);
    }

    @Override
    public boolean setSensor(String sensor, Any newSensor) throws Reject {
        Any mInMap = sensors.putIfAbsent(sensor, newSensor);
        if (mInMap != null) {
            throw new Reject("Sensor " + sensor + " already exist !");
        }
        return true;
    }

    @Override
    public Any[] getSensors() {
        return new Any[0];
    }
}
