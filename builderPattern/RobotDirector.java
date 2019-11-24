package builderPattern;

public class RobotDirector {
    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder){
        this.robotBuilder=robotBuilder;
    }
    public void makeRobot(){
        this.robotBuilder.buildHead();
        this.robotBuilder.buildLegs();
        this.robotBuilder.buildArms();
        this.robotBuilder.buildTorso();
    }
    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }
}
