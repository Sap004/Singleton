package ThreadSafe;

public class SingletonWithConcurrency {

    private static SingletonWithConcurrency threadSafeInstance=null;

    private SingletonWithConcurrency(){}

    //double thread locking
    public static SingletonWithConcurrency getInstance(){
        if(threadSafeInstance==null){
            synchronized (SingletonWithConcurrency.class){
                if(threadSafeInstance==null){
                    return new SingletonWithConcurrency();
                }
            }
        }
        return threadSafeInstance;
    }

}
