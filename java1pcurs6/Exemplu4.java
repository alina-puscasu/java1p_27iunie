public class Exemplu4 {
    public static void main(String [] args) {
        
        
        DatabaseManagerFactory manager1 = 
                DatabaseManagerFactory.create(
                    DatabaseManagerFactory.DatabaseType.ORACLE);
        manager1.select();
        
        manager1 = DatabaseManagerFactory.create(
                    DatabaseManagerFactory.DatabaseType.MySQL);
        manager1.select();
    }
}