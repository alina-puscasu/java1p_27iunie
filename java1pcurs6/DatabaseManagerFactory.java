public abstract class DatabaseManagerFactory {
    public static enum DatabaseType {
        ORACLE, MySQL
    } 
    
    public abstract void select();
    public abstract void insert();
    
    public static DatabaseManagerFactory create(DatabaseType type) {
        switch(type) {
            case ORACLE : return new OracleDatabaseManager();
            case MySQL : return new MySQLDatabaseManager();
        }
        throw new IllegalArgumentException();
    }
    
    public static class OracleDatabaseManager 
                            extends DatabaseManagerFactory {
        @Override
        public void select() {
            System.out.println("select in Oracle");
        }
        
        @Override
        public void insert() {
            System.out.println("insert in Oracle");
        }
    }
    
    public static class MySQLDatabaseManager 
                            extends DatabaseManagerFactory {
        @Override
        public void select() {
            System.out.println("select in MySQL");
        }
        
        @Override
        public void insert() {
            System.out.println("insert in MySQL");
        }
    }
}