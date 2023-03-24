package EagerLoading;

public class EagerLoadSingleton {

    private static EagerLoadSingleton instance=new EagerLoadSingleton();

    private EagerLoadSingleton(){}

    public static EagerLoadSingleton getInstance(){
        return instance;
    }
}
