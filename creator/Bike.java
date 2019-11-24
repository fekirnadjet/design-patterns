package creator;

public class Bike {
private Wheel theWheel;
private Frame theFrame;
//before using creator pattern
Bike(Wheel w,Frame f)
{
theFrame=f;
theWheel=w;
}
//using pattern
Bike(int w,int l){
theWheel=new Wheel(w);
theFrame=new Frame(l);
}
public static void main(String[] args) {
    Wheel wheel=new Wheel(16);
    Frame frame= new Frame(24);
    Bike bike =new Bike(wheel,frame);

    //using pattern

    Bike bikeCreator=new Bike (16,24);
}
}
