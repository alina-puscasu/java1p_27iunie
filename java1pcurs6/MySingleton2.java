public class MySingleton2 {
    private static MySingleton2 instance;
    
    private MySingleton2() {
    
    }
    //double checking singleton
    public static MySingleton2 getInstance() {
        if(instance == null) {
            synchronized(MySingleton2.class) {
                if(instance == null) {
                    instance = new MySingleton2();
                }
            }
        }
        return instance;
    }
}