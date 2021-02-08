abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Saving data in file...."; 
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Saving data in database....";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence p1=new FilePersistence();
    	System.out.println(p1.persist());
    	p1=new DatabasePersistence();
    	System.out.println(p1.persist());
    	
    }
}