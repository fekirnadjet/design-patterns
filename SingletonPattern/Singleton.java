package SingletonPattern;

public class Singleton {
    private static Singleton firstInstance=null;
    private Singleton(){}//the constructor must be private
     public  Singleton getInstanceOf(){
        if (firstInstance==null) firstInstance=new Singleton();
        return firstInstance;
    }
}
