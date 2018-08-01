public class MySingleton1 {
    //private static MySingleton1 instance = new MySingleton1();
    //eager singleton
    
    
    private static MySingleton1 instance;
    //lazy singleton
    
    private MySingleton1() {
    
    }
    
    public static MySingleton1 getInstance() {
        if(instance == null) {
            instance = new MySingleton1();
        }
        return instance;
    }
}