package fr.upem.robot.servant;

import fr.upem.robot.*;

public class RobotPiloteImpl implements RobotPiloteOperations {

    private Position position;
    private boolean isStarted = false;

    @Override
    public Position robotPosition() {
        return position;
    }

    @Override
    public void start() throws AlreadyStarted {
        if (isStarted) {
            throw new AlreadyStarted("Already started !");
        }
        isStarted = true;
    }

    @Override
    public void move(Position pos) throws InvalidPosition {
        if (!isStarted || pos.posX < 0 || pos.posY < 0) {
            throw new InvalidPosition("Invalid position !");
        }
        position = pos;
    }

    @Override
    public void stop(PositionHolder pos) throws NotStarted {
        if (!isStarted) {
            throw new NotStarted("Not started !");
        }
        isStarted = false;
        pos.value = position;
    }
}
