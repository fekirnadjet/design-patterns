package lowCoupling;

public class MonkeyLC extends Animal{
    private String name;


    MonkeyLC(String theName) {
        super(theName);
        name = theName;
    }

    public String toString(){
        return "Lion name "+name;
    }
}
