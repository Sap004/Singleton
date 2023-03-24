import EagerLoading.EagerLoadSingleton;
import LazyLoading.LazyLoadSingletonClass;
import ThreadSafe.SingletonWithConcurrency;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lazy Load Singleton");
        LazyLoadSingletonClass lazyInstance=LazyLoadSingletonClass.getInstance();
        System.out.println(lazyInstance);

        System.out.println("Eager Load Singleton");
        EagerLoadSingleton eagerInstance=EagerLoadSingleton.getInstance();
        System.out.println(eagerInstance);

        System.out.println("Thread safe Singleton");
        SingletonWithConcurrency threadsafeInstance= SingletonWithConcurrency.getInstance();
        System.out.println(threadsafeInstance);
    }
}