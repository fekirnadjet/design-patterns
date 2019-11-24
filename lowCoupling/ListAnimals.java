package lowCoupling;

public class ListAnimals {

    private Monkey newMonkey;
    private  Lion newLion;

    ListAnimals(Monkey m,Lion l){
        newMonkey=m;
        newLion=l;
    }
    public void displayAnimals(){
        System.out.println(newLion);
        System.out.println(newMonkey);
    }

    public static void main(String[] args) {
        Monkey newMonkey=new Monkey("Max");
        Lion newLion=new Lion("TOM") ;
        ListAnimals l=new ListAnimals(newMonkey,newLion);
        l.displayAnimals();
    }

}