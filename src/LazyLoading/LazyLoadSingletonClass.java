package LazyLoading;

public class LazyLoadSingletonClass {

    public static  LazyLoadSingletonClass instance=null;

    private LazyLoadSingletonClass(){}

    public static LazyLoadSingletonClass getInstance(){
        if(instance==null){
            return new LazyLoadSingletonClass();
        }
        return instance;
    }
}
