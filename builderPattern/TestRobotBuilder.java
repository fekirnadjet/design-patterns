package builderPattern;

public class TestRobotBuilder {
    public static void main(String[] args) {

        RobotBuilder oldRobotBuilder=new OldRobotBuilder();
        RobotDirector robotDirector=new RobotDirector(oldRobotBuilder);
        robotDirector.makeRobot();
        Robot firstRobot =robotDirector.getRobot();
        System.out.println("head: "+firstRobot.getRobotHead());
        System.out.println("Arms: "+firstRobot.getRobotArms());
        System.out.println("Legs: "+firstRobot.getRobotLegs());
        System.out.println("Torso: "+firstRobot.getRobotTorso());
    }
}
