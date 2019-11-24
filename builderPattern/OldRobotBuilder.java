package builderPattern;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;
    public OldRobotBuilder(){
        robot=new Robot();
    }
    @Override
    public void buildHead() {
        robot.setRobotHead("headd");

    }

    @Override
    public void buildTorso() {
        robot.setRobotTorso("torsooo");

    }

    @Override
    public void buildArms() {
robot.setRobotArms("armssss");
    }

    @Override
    public void buildLegs() {
robot.setRobotLegs("leggss");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
