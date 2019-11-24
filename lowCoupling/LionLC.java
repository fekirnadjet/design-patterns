package lowCoupling;

public class LionLC extends Animal {
    private String name;
    LionLC(String theName) {
        super(theName);
         name = theName;
    }
    public String toString(){
        return "Lion name "+name;
    }
}
